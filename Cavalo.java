package polimorfismoheranca2;

		public class Cavalo implements Animal{


	    @Override
	    public void nome() {
	        System.out.println("Nome: Fly");        
	        
	    }

	    @Override
	    public void idade() {
	        System.out.println("Idade: 10 anos");
	        
	    }

	    @Override
	    public void pelo() {
	        System.out.println("Pelo: Sim");
	        
	    }

	    @Override
	    public void emiteSom() {
	        System.out.println("Som: Relincho");
	        
	    }

	    @Override
	    public void cor() {
	        System.out.println("Cor: Bege");
	        
	    }
	    
	    public void corre() {
	        System.out.println("Corre: Sim, 100 km/h");
	    }

	    
	}

