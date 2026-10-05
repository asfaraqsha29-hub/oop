class Array1{
	
	public static void main(String args[]){
		
	int numbers[][]=new int [3][4];
	
    numbers	[0][0]=34;
	numbers	[0][1]=45;
	numbers	[0][2]=38;
	numbers	[0][3]=34;
	
	numbers	[1][0]=22;
	numbers	[1][1]=49;
	numbers	[1][2]=55;
	numbers	[1][3]=57;
	
	for(int i=0;i<numbers.length;i++){
		for(int j=0;j<numbers[i].length;j++){
			System.out.println("["+i+"][:"+j+"]:"+numbers[i][j]+"\t");
		}
		System.out.println();
	}
	}
}