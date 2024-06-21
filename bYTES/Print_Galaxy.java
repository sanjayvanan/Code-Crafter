import java.io.*; 
class Print_Galaxy
{ 
	static void printGalaxy(char mat[][], int n) 
	{ 
		for (int i = 0; i < n; i++) 
		{ 
			if (mat[0][i] == '#' && mat[1][i] == '#'
				&& mat[2][i] == '#') { 
				System.out.print('#'); 
			} 	
			else if (mat[0][i] == '.' && mat[1][i] == '.'
					&& mat[2][i] == '.') { 
			} 
			else { 
				char a, b, c, a1, b1; 
				char c1, a2, b2, c2; 
				int x1 = i; 
				a = mat[0][x1]; 
				b = mat[0][x1 + 1]; 
				c = mat[0][x1 + 2]; 
				a1 = mat[1][x1]; 
				b1 = mat[1][x1 + 1]; 
				c1 = mat[1][x1 + 2]; 
				a2 = mat[2][x1]; 
				b2 = mat[2][x1 + 1]; 
				c2 = mat[2][x1 + 2]; 
				if (a == '.' && b == '*' && c == '.'
					&& a1 == '*' && b1 == '*' && c1 == '*'
					&& a2 == '*' && b2 == '.'
					&& c2 == '*') { 
					System.out.print("A"); 
					i = i + 2; 
				} 
				if (a == '*' && b == '*' && c == '*'
					&& a1 == '*' && b1 == '*' && c1 == '*'
					&& a2 == '*' && b2 == '*'
					&& c2 == '*') { 
					System.out.print("E"); 					
					i = i + 2; 
				} 
				if (a == '*' && b == '*' && c == '*'
					&& a1 == '.' && b1 == '*' && c1 == '.'
					&& a2 == '*' && b2 == '*'
					&& c2 == '*') { 	
					System.out.print("I"); 
					i = i + 2; 
				} 				
				if (a == '*' && b == '*' && c == '*'
					&& a1 == '*' && b1 == '.' && c1 == '*'
					&& a2 == '*' && b2 == '*'
					&& c2 == '*') { 
					System.out.print("O"); 
					i = i + 2; 
				} 
				if (a == '*' && b == '.' && c == '*'
					&& a1 == '*' && b1 == '.' && c1 == '*'
					&& a2 == '*' && b2 == '*'
					&& c2 == '*') { 
					System.out.print("U"); 
					i = i + 2; 
				} 
			} 
		} 
	} 
	public static void main(String[] args) 
	{ 
		int N = 18; 
		char mat[][] = { 
			{ '*', '.', '*', '#', '*', '*', '*', '#', '*', 
			'*', '*', '#', '*', '*', '*', '.', '*', '.' }, 
			{ '*', '.', '*', '#', '*', '.', '*', '#', '.', 
			'*', '.', '#', '*', '*', '*', '*', '*', '*' }, 
			{ '*', '*', '*', '#', '*', '*', '*', '#', '*', 
			'*', '*', '#', '*', '*', '*', '*', '.', '*' } 
		}; 
		printGalaxy(mat, N); 
	} 
} 

