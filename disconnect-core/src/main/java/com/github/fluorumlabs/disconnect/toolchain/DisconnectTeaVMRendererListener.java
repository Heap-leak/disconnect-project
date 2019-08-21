package com.github.fluorumlabs.disconnect.toolchain;

import org.teavm.backend.javascript.rendering.RenderingManager;
import org.teavm.vm.BuildTarget;
import org.teavm.vm.spi.RendererListener;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Artem Godin on 8/20/2019.
 */
public class DisconnectTeaVMRendererListener implements RendererListener {
    private final Set<String> packages = new HashSet<>();
    private final List<String> imports = new ArrayList<>();
    private File root;

    public void addPackage(String packageJsonRow) {
        packages.add(packageJsonRow);
    }

    public void addImport(String importRow) {
        if (!imports.contains(importRow)) {
            imports.add(importRow);
        }
    }

    @Override
    public void begin(RenderingManager context, BuildTarget buildTarget) throws IOException {
        root = new File(context.getProperties().getProperty("frontend.directory"));
    }

    @Override
    public void complete() throws IOException {
        if ( !root.exists() ) {
            Files.createDirectory(root.toPath());
        }
        File src = new File(root,"src");
        if ( !src.exists()) {
            Files.createDirectory(new File(root, "src").toPath());
        }

        writeAppJs();
        writePackageJson();
    }

    private void writeAppJs() throws IOException {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(new File(root, "src/app.js")))) {
            printWriter.print(String.join("\n", imports));
            // language=js
            printWriter.print("\n" +
                    "import_teavm_classes_js\n" +
                    "\n" +
                    "main();\n"
            );
        }
    }

    private void writePackageJson() throws IOException {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(new File(root, "package.json")))) {
            // language=json
            printWriter.print("{\n" +
                    "    \"dependencies\": {\n" +
                    "" +
                    packages.stream()
                            .distinct()
                            .collect(Collectors.joining(",\n")) + ",\n" +
                    "        \"@babel/core\": \"^7.5.5\",\n" +
                    "        \"@babel/preset-env\": \"^7.5.5\",\n" +
                    "        \"core-js\": \"^3.2.1\",\n" +
                    "        \"rollup\": \"^1.19.4\",\n" +
                    "        \"rollup-plugin-babel\": \"^4.3.3\",\n" +
                    "        \"rollup-plugin-commonjs\": \"^10.0.2\",\n" +
                    "        \"rollup-plugin-ignore\": \"^1.0.5\",\n" +
                    "        \"rollup-plugin-node-resolve\": \"^5.2.0\",\n" +
                    "        \"rollup-plugin-replace\": \"^2.2.0\",\n" +
                    "        \"rollup-plugin-terser\": \"^5.1.1\"\n" +
                    "    },\n" +
                    "    \"scripts\": {\n" +
                    "        \"rollup\": \"rollup -c rollup.config.js\"\n" +
                    "    }\n" +
                    "}\n");
        }
    }
}