enum Suit{
		MON("red"), 
		TUE("orange"), 
		WED("yello"), 
		THU("green"),
		FRI("blue"),
		SAT("indigo"),
		SUN("purple");
		
		
		private final String color;
		
		private Suit(String suitColor) 
		{
			this.color = suitColor;
		}
		
		public String getColor() {
			return this.color;
		}
		
		
	}


