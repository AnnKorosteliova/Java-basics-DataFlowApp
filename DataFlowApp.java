
public class DataFlowApp {
	
		public static void main(String[] args) {
		
		System.out.println( DataTransformer.integerToShort ( DataTransformer.doubleToInteger(1.5) ) );
		}
		
}

class DataTransformer {
  	
	static byte integerToByte( int value ) {
		if( value >= -128 && value <= 127) {
			byte tvalue = (byte) value; 
			return tvalue;
		} else {
			System.out.print( "WARNING! the value " + value +  " overflows byte range. DATA will was lost!" );
			return 0;
		}
	}
	
	static int byteToInteger( byte value ) {
		if( value >= -2147483648 && value <= 2147483647) {
			int tvalue = ( int )value;  //tvalue = transformed value
			return tvalue;
		} else {
			System.out.println( "WARNING! the value" + value +  "overflows int range. DATA will was lost!" );
			return 0;
		}
	}
	
	static int doubleToInteger( double value ) {
		if( value >= -2147483648 && value <= 2147483647) {
			int tvalue = ( int )value;  //tvalue = transformed value
			return tvalue;
		} else {
			System.out.println( "WARNING! the value" + value +  "overflows int range. DATA will was lost!" );
			return 0;
		}
	}
	
	static double integerToDouble( int value ) {
		if( value >= 2.2250738585072014e-308 && value <= 1.7976931348623158e+308) {
			double tvalue = ( double )value;  //tvalue = transformed value
			return tvalue;
		} else {
			System.out.println( "WARNING! the value" + value +  "overflows double range. DATA will was lost!" );
			return 0;
		}
	}
	
	static int shortToInteger( short value ) {
		if( value >= -2147483648 && value <= 2147483647) {
			int tvalue = ( int )value;  //tvalue = transformed value
			return tvalue;
		} else {
			System.out.println( "WARNING! the value" + value +  "overflows int range. DATA will was lost!" );
			return 0;
		}
	}
	
	static short integerToShort( int value ) {
		if( value >= -32768 && value <= 32767) {
			short tvalue = ( short )value;  //tvalue = transformed value
			return tvalue;
		} else {
			System.out.println( "WARNING! the value" + value +  "overflows short range. DATA will was lost!" );
			return 0;
		}
	}
}

