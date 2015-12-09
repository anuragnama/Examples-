import org.hibernate.cfg.Configuration;


public class test {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.buildSessionFactory();
	}
}
