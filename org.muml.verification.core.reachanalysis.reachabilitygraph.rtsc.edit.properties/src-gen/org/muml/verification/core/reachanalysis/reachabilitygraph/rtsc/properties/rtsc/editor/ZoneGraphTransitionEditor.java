
package org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.properties.rtsc.editor;

/**
 * @generated
 */
public class ZoneGraphTransitionEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ZoneGraphTransitionEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorSource_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorTarget_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorFiredRTSCTransitions_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorSource_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorTarget_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorFiredRTSCTransitions_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorFiredRTSCTransitions_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorFiredRTSCTransitions_property_tab_generalTab_Editor() {
		if (this.editorFiredRTSCTransitions_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.RtscPackage.eINSTANCE
					.getZoneGraphTransition_FiredRTSCTransitions();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorFiredRTSCTransitions_property_tab_generalTab = editor;
		}
		return this.editorFiredRTSCTransitions_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSource_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorSource_property_tab_generalTab_Editor() {
		if (this.editorSource_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage.eINSTANCE
					.getReachabilityGraphTransition_Source();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The source state of this transition.");

			this.editorSource_property_tab_generalTab = editor;
		}
		return this.editorSource_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorTarget_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorTarget_property_tab_generalTab_Editor() {
		if (this.editorTarget_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage.eINSTANCE
					.getReachabilityGraphTransition_Target();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The target state of this transition.");

			this.editorTarget_property_tab_generalTab = editor;
		}
		return this.editorTarget_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExtensions_property_tab_extensionsTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExtensions_property_tab_extensionsTab_Editor() {
		if (this.editorExtensions_property_tab_extensionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getExtendableElement_Extensions();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.FlattenedListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Extendable Elements can be extended by an Extension.");

			this.editorExtensions_property_tab_extensionsTab = editor;
		}
		return this.editorExtensions_property_tab_extensionsTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ZoneGraphTransitionEditor(String tab) {
		this(tab,
				org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.RtscPackage.eINSTANCE
						.getZoneGraphTransition());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new ZoneGraphTransitionEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.extensions"}).contains(tab);
		}
	}

}
