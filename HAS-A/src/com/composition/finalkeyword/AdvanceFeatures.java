package com.composition.finalkeyword;

	public class AdvanceFeatures {
		
		private String colour;
		private double weight;
		private String chargingCapacity;
		public AdvanceFeatures(String colour, double weight, String chargingCapacity) {
			
			this.colour = colour;
			this.weight = weight;
			this.chargingCapacity = chargingCapacity;
		}
		public String getColour() {
			return colour;
		}
		
		public double getWeight() {
			return weight;
		}
		
		public String getChargingCapacity() {
			return chargingCapacity;
		}
		
		@Override
		public String toString() {
			return "AdvanceFeatures [colour=" + colour + ", weight=" + weight + ", chargingCapacity=" + chargingCapacity
					+ "]";
		}
		
		
		
		

	}


