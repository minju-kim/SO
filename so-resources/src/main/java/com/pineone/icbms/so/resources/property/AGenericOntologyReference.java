package com.pineone.icbms.so.resources.property;

/**
 * Generic ontology reference abstract class.<BR/>
 * Created by uni4love on 2015. 10. 20..
 */
abstract public class AGenericOntologyReference
		implements IGenericOntologyReference
{
	/**
	 * id
	 */
	protected String id;

	/**
	 * name
	 */
	protected String name;

	@Override
	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	@Override
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
