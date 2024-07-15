package mutators.study;

public final class ImmutableKeywords {
	//Area of  CIRCLE
	public final float PI;

	public ImmutableKeywords(float pi) {
		PI = pi;

	}

	public final void areaOfCircle(int radius) {

		float area = PI * radius * radius;
		System.out.println("AREA OF CIRCLE="+area);
	}

}
