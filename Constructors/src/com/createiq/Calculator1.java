package com.createiq;

public class Calculator1 {

	
		public int sum(int a, int b) {
			return a + b;
		}

		public byte sum(byte a, byte b) {
			return (byte) (a + b);
		}

		public short sum(short a, short b) {
			return (short) (a + b);
		}

		public double sum(double a, double b) {
			return a + b;
		}

		public float multiply(float a, float b) {
			return a * b;
		}

		public long sum(long a, long b) {
			return a + b;
		}

		public static void main(String[] args) {
			Calculator cal = new Calculator();
			int result = cal.sum(10, 20);
			System.out.println(result);
			long result2=cal.sum(12345l, 4567l);
			System.out.println(result2);
			float result3=cal.sum(3.0f,3.0f);
			System.out.println(result3);
		}

	}


