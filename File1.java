package vd;


		import java.io.File;
		import java.io.IOException;
		import java.io.InputStreamReader;

		public class File1 {



			public static void main(String[] args) throws IOException {
				File f1=new File("abc.txt");
				if(f1.createNewFile()) {
					System.out.println("file"+ f1.getName()+"is created successfully");
					
				}
				else {
					System.out.println("file already exist");
				}
				if(f1.exists()) {
					System.out.println("The file name is"  +f1.getName());
					System.out.println("path is"+f1.getPath() );
					System.out.println("absloute path is" + f1.getAbsolutePath());
					System.out.println(isFile());
					System.out.println(f1.isDirectory());
				}		
				}

			private static  boolean isFile() {
				
				return true ;
			}
		}