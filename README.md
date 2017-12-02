# Liferay Blueprint Fragment Example

This is a sample OSGi fragment used to demonstrate how to use Blueprint Framework to extend components in Liferay.

In particular this fragment simply overrides settings of ParagraphDDMFormFieldType, in order to show the _indexable_
option in the field configuration panel.

In order to make it work, you have to:
	* Copy all jar files from org-apache-aries-blueprint folder into ${LIFERAY_HOME}/deploy, in order to install the Apache Aries Blueprint suite
	* Deploy the fragment module, in order to extend the ParagraphDDMFormFieldType service
	
Please visit my blog post at https://web.liferay.com/it/web/glassofwhiskey/blog/-/blogs/blueprint-and-osgi-fragments-for-granular-module-extension
for more details.