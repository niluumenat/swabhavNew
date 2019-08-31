package com.techlabs.chapter5;

public class MadolinSpec extends InstrumentSpec {
	private Style style;

	public MadolinSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, Style style) {
		super(builder, model, type, backWood, topWood);
		this.style = style;
		// TODO Auto-generated constructor stub
	}

	public Style getStyle() {
		return style;
	}

	public boolean matches(InstrumentSpec otherSpec) {
		if (!super.matches(otherSpec))
			return false;
		if (!(otherSpec instanceof GuitarSpec))
			return false;
		MadolinSpec spec = (MadolinSpec) otherSpec;
		if (style != spec.style)
			return false;
		return true;

	}

}
