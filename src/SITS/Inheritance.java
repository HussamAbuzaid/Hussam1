package SITS;

public class Inheritance {

	
		class Ford
		{
			public void start()
			{
				System.out.println("start the car");
		    }
			public void stop()
			{
				System.out.println("stop the car");
			}
		}

		class BMW extends Ford
		{
			public void BMW_SPC ()
			{
				System.out.println("special future of BMW");
				
				public static void main(String[] args) {
					// TODO Auto-generated method stub
			}
		}

		class Porsche extends BMW
		{
			public void Porche_SPC()

		{
			System.out.println("special future of Porsche");
		}
		}
		

			
		Porsche p=new Porsche();
		p.start();
		p.stop();
		p.Porche_SPC();
		System.out.println("*********************");
		BMW b=new BMW();
		b.start();
		b.stop();
		b.BMW_SPC();

	}

}
