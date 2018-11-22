package carStore;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;
import com.thoughtworks.xstream.security.NoTypePermission;
import com.thoughtworks.xstream.security.NullPermission;
import com.thoughtworks.xstream.security.PrimitiveTypePermission;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Classe responsavel pela interação com a base de dados.
 *
 */
public class DataBase {

	 Class<?>[] classes = new Class[] { DataBase.class};
	String arquivoClient;
	String arquivoAutomobile;
	String arquivoCategory;

	private DataBase(){

	}
	/**
	 * Construtor
	 * @param conexao;  representa o tipo de arquivo a ser utilizado. 
	 * conexao == aplication inicia com a base de dados de produção, caso contrario base de dados de testes.
	 *
	 */
	public DataBase(String conexao){

		if(conexao == "aplication") //Cria os arquivos para serem usados na aplicação;
		{ 
			this.arquivoClient = "Clients.xml"; 
			this.arquivoAutomobile = "Cars.xml";
			this.arquivoCategory = "Categories.xml";
			
		}

		else //Cria um arquivo para ser usado nos testes;
		{
			this.arquivoClient = "TestClients.xml";
			this.arquivoAutomobile = "TestCars.xml";
			this.arquivoCategory = "TestCategories.xml";
		}
	}

	/**
	 * @param clients
	 * 
	 * Guarda na base de dados todos os clientes.
	 *
	 */
	public void setClientesXML(List<Client> clients) {

		XStream xStream = new XStream();
		XStream.setupDefaultSecurity(xStream); 
		xStream.allowTypes(classes);
		
		xStream.alias("client", Client.class);
		
		File arquivo = new File(this.arquivoClient);
		FileOutputStream gravar;
		try {
			gravar = new FileOutputStream(arquivo);
			gravar.write(xStream.toXML(clients).getBytes());
			gravar.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		} }

	/**
	 * 
	 * @return clients;
	 * Carrega da base de dados todos os clientes.
	 *
	 */
	@SuppressWarnings("unchecked")
	public List<Client> getClientesXML() {
		List<Client> clients = new ArrayList<Client>();
		
		try {

			XStream xStream = new XStream(new Dom4JDriver());
			xStream.addPermission(NullPermission.NULL);
			xStream.addPermission(PrimitiveTypePermission.PRIMITIVES);
			xStream.alias("client", Client.class);
			xStream.processAnnotations(Client.class);

			BufferedReader input = new BufferedReader(new FileReader(this.arquivoClient));

			clients = (List<Client>) xStream.fromXML(input);
			input.close();


		} catch (IOException ex) {      
			ex.printStackTrace();
		}

		return clients;
	}


	/**
	 * @param cars
	 * 
	 * Guarda na base de dados todos os automoveis.
	 *
	 */

	public void setCarsXML(List<Automobile> cars) {

		XStream xStream = new XStream();
		xStream.alias("automobile", Automobile.class);

		File arquivo = new File(this.arquivoAutomobile);
		FileOutputStream gravar;
		try {
			gravar = new FileOutputStream(arquivo);
			gravar.write(xStream.toXML(cars).getBytes());
			gravar.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		} }

	/**
	 * 
	 * @return automobiles;
	 * Carrega da base de dados todos os automoveis.
	 *
	 */
	@SuppressWarnings("unchecked")
	public List<Automobile> getCarsXML() {
		List<Automobile> automobiles = new ArrayList<Automobile>();


		try {

			XStream xStream = new XStream(new Dom4JDriver());
			xStream.addPermission(NullPermission.NULL);
			xStream.addPermission(PrimitiveTypePermission.PRIMITIVES);
			xStream.alias("automobile", Automobile.class);
			xStream.processAnnotations(Automobile.class);

			BufferedReader input = new BufferedReader(new FileReader(this.arquivoAutomobile));

			automobiles = (List<Automobile>) xStream.fromXML(input);
			input.close();


		} catch (IOException ex) {      
			ex.printStackTrace();
		}

		return automobiles;
	}
	
	/**
	 * @param categoryManager
	 * 
	 * Guarda na base de dados o gerenciador de categorias.
	 *
	 */
	public void setCategorysXML(CategoryManager categoryManager) {

		XStream xStream = new XStream();
		xStream.alias("categoryManager", CategoryManager.class);
		
		File arquivo = new File(this.arquivoCategory);
		FileOutputStream gravar;
		try {
			gravar = new FileOutputStream(arquivo);
			gravar.write(xStream.toXML(categoryManager).getBytes());
			gravar.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		} }

	/**
	 * 
	 * @return categoryManager;
	 * Carrega da base de dados o Gerenciador de Categorias.
	 *
	 */
	@SuppressWarnings("unchecked")
	public CategoryManager getCategoryManagerXML() {
		CategoryManager categoryManager = new CategoryManager();
		
		try {

			XStream xStream = new XStream(new Dom4JDriver());
			xStream.addPermission(NullPermission.NULL);
			xStream.addPermission(PrimitiveTypePermission.PRIMITIVES);
			xStream.alias("categoryManager", CategoryManager.class);
			xStream.processAnnotations(CategoryManager.class);

			BufferedReader input = new BufferedReader(new FileReader(this.arquivoCategory));

			categoryManager = (CategoryManager) xStream.fromXML(input);
			input.close();


		} catch (IOException ex) {      
			ex.printStackTrace();
		}

		return categoryManager;
	}

}






