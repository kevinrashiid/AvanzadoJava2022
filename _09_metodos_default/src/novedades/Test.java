package novedades;
interface Calculadora{//todo lo que hay dentro de una interfaz es abstracto a menos que le pongamos default
	
	int sumar(int a, int b);
	int restar(int a, int b);
	default int multiplicar(int a, int b) {
		return a*b;
	}
	default int sumatorio(int[] nums){		//recibe un array de numeros
		
		int suma=0;
		for(int n:nums) {
			suma+=n;
		}
		return suma;
	}
}

interface Estadisticas{
	int media(int [] nums);//recibe un array de numeros
	default int sumatorio(int [] nums) {
		return nums[0]+nums[nums.length-1];
	}
}
class Matematicas implements Calculadora, Estadisticas{//implementamos estas dos interfaces(Calculadora, Estadisticas) para utilizar sus metodos
	@Override
	public int sumatorio(int[] nums) {/*sobrescribimos sumatorio por que hay un sumatorio en cada interfaz 
									  y eso da error y hay que sobrescribir una de ellas*/
		return Estadisticas.super.sumatorio(nums);
	}
	
	@Override
	public int media(int[] nums) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sumar(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int restar(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class Test {

	public static void main(String[] args) {
	}
}