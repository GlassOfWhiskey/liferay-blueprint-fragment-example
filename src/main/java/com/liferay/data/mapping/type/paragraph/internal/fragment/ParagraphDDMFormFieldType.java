package com.liferay.data.mapping.type.paragraph.internal.fragment;

import com.liferay.dynamic.data.mapping.form.field.type.BaseDDMFormFieldType;
import com.liferay.dynamic.data.mapping.form.field.type.DDMFormFieldTypeSettings;

/**
 * @author Renato Rego
 * @author Iacopo Colonnelli
 */
public class ParagraphDDMFormFieldType extends BaseDDMFormFieldType {

	@Override
	public Class<? extends DDMFormFieldTypeSettings>
		getDDMFormFieldTypeSettings() {

		return ParagraphDDMFormFieldTypeSettings.class;
	}

	@Override
	public String getName() {
		return "paragraph";
	}
}