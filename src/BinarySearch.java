
public class BinarySearch {
	
	public static int BinarySearch( int f,  int ff, int[]a, int b) {
		
		
		int m = ( f + ff ) / 2 ;
		
		
		if( a[m] == b ) {
			return m ;
		}
		
		if( a[f] == b ) {
			return f ;
		}
		
		if( a[ff] == b ) {
			return ff ;
		}
		
		
		if( a[m] > b ) {
			 ff = m - 1 ;
			return  BinarySearch( f, ff, a, b) ;
		}else{
			f = m + 1 ;
			return  BinarySearch( f, ff, a, b) ;
		}
	
		
	}
	
	public static void main(String[] args) {
		
		int[] a = { 3, 5, 4, 8, 9} ;
		int p = BinarySearch( 0, a.length - 1 , a, 3 );
		System.out.println( p );
		
	}

}
