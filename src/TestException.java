
public class TestException {

	public static void main(String[] args) {

		try {

			int val = 10/0;

			int[] valores = new int[3];
			System.out.println(valores[4]);

			String nome = null;
			System.out.println(nome.length());

			int numero = Integer.parseInt("zero");

		} catch (ArithmeticException e) {

			System.out.println("Nao e possivel realizar uma divisao por zero!");

			// Mensagem com a lista de erros
			System.out.println(e.getMessage());
			// Imprime a pilha de erro da excecao
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Nao e possivel acessar a posicao 4 do array !");
		} catch (NullPointerException e) {

			System.out.println("Nao foi possivel retornar o length, variavel nome nao instanciada! ");
		} catch (NumberFormatException e) {

			System.out.println("Nao foi possivel realizar a conversao!");
		} catch (Exception e) {

			System.out.println("Erro na execucao do programa!");
		}

	}
	
}
