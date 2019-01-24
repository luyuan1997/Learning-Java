package p20190124;

public class ThreadLocalForSession {
	private static final ThreadLocal threadSession = new ThreadLocal<>();
	public static Session getSession() throws InfrastructureException{
		Session s = (Session)threadSession.get();
		try {
			if(s ==null) {
				s = getSessionFactory().openSession();
				threadSession.set(s);
			}
		} catch(HibernateException ex) {
			throw new InfrastructureException(ex);
		}
		return s;
	}
}
