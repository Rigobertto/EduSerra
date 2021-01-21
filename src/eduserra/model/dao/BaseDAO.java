package eduserra.model.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class  BaseDAO <VO>{
    Connection conn = null;
	private static final String URL = "_MUDAR AQUI_"; // LEMBRAR DE TROCAR URLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL
	private static final String USER = "postgres";
	private static final String SENHA = "riguinho"; // Lembrar de trocar a senhaaaaaaaaaaaaaaaaaaaaaaaaa
	
	public Connection getConnection() {
            if(conn == null) {
		try {
                    conn = DriverManager.getConnection(URL, USER, SENHA);
		} catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
		}
		return conn;
            }else
		return conn;
	}
    public abstract void cadastrar(VO vo) throws SQLException;
    public abstract void excluir(VO vo) throws SQLException;
    public abstract void editar(VO vo) throws SQLException;
    public abstract ResultSet buscaID(VO vo) throws SQLException;
}
