package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.vaadin.i18n.LoginI18n;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface LoginMixin extends Element {
	/**
	 * If set, a synchronous POST call will be fired to the path defined.
	 * The <code>login</code> event is also dispatched, so <code>event.preventDefault()</code> can be called to
	 * prevent the POST call.
	 */
	@Nullable
	@JSProperty
	String getAction();

	/**
	 * If set, a synchronous POST call will be fired to the path defined.
	 * The <code>login</code> event is also dispatched, so <code>event.preventDefault()</code> can be called to
	 * prevent the POST call.
	 */
	@JSProperty
	void setAction(String action);

	/**
	 * If set, disable the &quot;Log in&quot; button and prevent user from submitting login form.
	 * It is re-enabled automatically, when error is set to true, allowing form resubmission
	 * after user makes changes.
	 */
	@JSProperty
	boolean isDisabled();

	/**
	 * If set, disable the &quot;Log in&quot; button and prevent user from submitting login form.
	 * It is re-enabled automatically, when error is set to true, allowing form resubmission
	 * after user makes changes.
	 */
	@JSProperty
	void setDisabled(boolean disabled);

	/**
	 * If set, the error message is shown. The message is hidden by default.
	 * When set, it changes the disabled state of the submit button.
	 */
	@JSProperty
	boolean isError();

	/**
	 * If set, the error message is shown. The message is hidden by default.
	 * When set, it changes the disabled state of the submit button.
	 */
	@JSProperty
	void setError(boolean error);

	/**
	 * Whether to hide the forgot password button. The button is visible by default.
	 */
	@JSProperty
	boolean isNoForgotPassword();

	/**
	 * Whether to hide the forgot password button. The button is visible by default.
	 */
	@JSProperty
	void setNoForgotPassword(boolean noForgotPassword);

	/**
	 * The object used to localize this component.
	 * For changing the default localization, change the entire
	 * <em>i18n</em> object or just the property you want to modify.
	 * <p>
	 * The object has the following JSON structure (by default it doesn't include <code>additionalInformation</code>
	 * and <code>header</code> sections, <code>header</code> can be added to override <code>title</code> and
	 * <code>description</code> properties
	 * in <code>vaadin-login-overlay</code>):
	 *
	 * <pre><code>    {
	 *       header: {
	 *         title: 'App name',
	 *         description: 'Inspiring application description'
	 *       },
	 *       form: {
	 *         title: 'Log in',
	 *         username: 'Username',
	 *         password: 'Password',
	 *         submit: 'Log in',
	 *         forgotPassword: 'Forgot password'
	 *       },
	 *       errorMessage: {
	 *         title: 'Incorrect username or password',
	 *         message: 'Check that you have entered the correct username and password and try again.'
	 *       },
	 *       additionalInformation: 'In case you need to provide some additional info for the user.'
	 *     }
	 * </code></pre>
	 */
	@Nullable
	@JSProperty
	LoginI18n getI18n();

	/**
	 * The object used to localize this component.
	 * For changing the default localization, change the entire
	 * <em>i18n</em> object or just the property you want to modify.
	 * <p>
	 * The object has the following JSON structure (by default it doesn't include <code>additionalInformation</code>
	 * and <code>header</code> sections, <code>header</code> can be added to override <code>title</code> and
	 * <code>description</code> properties
	 * in <code>vaadin-login-overlay</code>):
	 *
	 * <pre><code>    {
	 *       header: {
	 *         title: 'App name',
	 *         description: 'Inspiring application description'
	 *       },
	 *       form: {
	 *         title: 'Log in',
	 *         username: 'Username',
	 *         password: 'Password',
	 *         submit: 'Log in',
	 *         forgotPassword: 'Forgot password'
	 *       },
	 *       errorMessage: {
	 *         title: 'Incorrect username or password',
	 *         message: 'Check that you have entered the correct username and password and try again.'
	 *       },
	 *       additionalInformation: 'In case you need to provide some additional info for the user.'
	 *     }
	 * </code></pre>
	 */
	@JSProperty
	void setI18n(LoginI18n i18n);
}
