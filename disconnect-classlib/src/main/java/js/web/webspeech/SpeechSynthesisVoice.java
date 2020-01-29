package js.web.webspeech;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** This Web Speech API interface represents a voice that the system supports. Every SpeechSynthesisVoice has its own relative speech service including information about language, name and URI. */
        public interface SpeechSynthesisVoice extends Any {
        @JSProperty
        boolean isDefault();

        @JSProperty
        String getLang();

        @JSProperty
        boolean isLocalService();

        @JSProperty
        String getName();

        @JSProperty
        String getVoiceURI();

        @JSBody(script = "return SpeechSynthesisVoice.prototype")
        static SpeechSynthesisVoice prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SpeechSynthesisVoice()")
        static SpeechSynthesisVoice create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
