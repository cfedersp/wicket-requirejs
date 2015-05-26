package de.agilecoders.wicket.requirejs;

public class DefaultRequireJsSettingsFactory implements IRequireJsSettingsFactory {
	public RequireJsSettings create() {
		return new RequireJsSettings();
	}
}
