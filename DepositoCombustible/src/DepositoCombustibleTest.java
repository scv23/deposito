import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DepositoCombustibleTest {

	@Test
	void test() {
		class main {
			public void main (String[] args) {
		        // create the tank
		        DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		        tank.consumir(25.0);
		    }        
		}
		
		class DepositoCombustible {

		    private double depMax;
		    private double depNivel;
		    
		    DepositoCombustible(double tankMax, double tankLevel) {
		        this.depMax   = tankMax;
		        this.depNivel = tankLevel;
		    }
		
		    public void consumir(double amount){
		        depNivel = depNivel - amount;
		    }
		}
	}

}
