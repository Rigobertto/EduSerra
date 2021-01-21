package eduserra.model.dao;

import eduserra.model.vo.AlunoVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AlunoDAO<VO extends AlunoVO> extends BaseDAO<VO>{
    
    @Override
    public void cadastrar(VO vo) throws SQLException {
        conn = getConnection();
		String sql = "insert into Aluno (nome, idade, genero, telefone, email, vila, "
                        + "rua, numero, referencia, curso, linga) values (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ptst2;
            try {
		ptst2 = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		ptst2.setString(1, vo.getNome());
		ptst2.setInt(2, vo.getIdade());
		ptst2.setString(3, vo.getGenero());
		ptst2.setString(4, vo.getTelefone());
		ptst2.setString(5, vo.getEmail());
		ptst2.setString(6, vo.getEndereco().getVila());
		ptst2.setString(7, vo.getEndereco().getRua());
                ptst2.setInt(8, vo.getEndereco().getNumeroCasa());
                ptst2.setString(9, vo.getEndereco().getReferencia());
                ptst2.setString(10, vo.getCurso());
                ptst2.setString(11, vo.getLingua());
		int affectedRolls = ptst2.executeUpdate();
			
		if(affectedRolls == 0) {
                    // System.out.println("Falha em cadastrar o usuário");
		return;
                }
			
                ResultSet chave = ptst2.getGeneratedKeys();
                if(chave.next()) {
                    vo.setIde(chave.getInt(1));
                } else {
                    // System.out.println("Falha ao obter Id de usuário cadastrado.");
                }
			
            } catch (SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
            }
    }

    @Override
    public void excluir(VO vo) throws SQLException {
        conn = getConnection();
	String sql = "delete from Aluno where ide = ?"; // revisar dps
	PreparedStatement ptst;
	try {
            ptst = conn.prepareStatement(sql);
            ptst.setInt(1, vo.getIde());
            ptst.executeUpdate(); //NOTA P/ Rigo: PELO AMOR DE DEUS LEMBRAR DE FAZER
	}catch(SQLException e) {	// A DELEÇÃOO EM CASCATA
            e.printStackTrace();
	}
    }

    @Override
    public void editar(VO vo) throws SQLException {
        conn = getConnection();
	String sql = "update Aluno set nome = ?, idade = ?, genero = ?, telefone = ?, "
                + "email = ?, vila = ?, rua = ?, numero = ?, referencia = ?, curso = ?, lingua = ? where ide = ?"; // revisar dps
	PreparedStatement ptst = conn.prepareStatement(sql);
	try {
            ptst.setString(1, vo.getNome());
            ptst.setInt(2, vo.getIdade());
            ptst.setString(3, vo.getGenero());
            ptst.setString(4, vo.getTelefone());
            ptst.setString(5, vo.getEmail());
            ptst.setString(6, vo.getEndereco().getVila());
            ptst.setString(7, vo.getEndereco().getRua());
            ptst.setInt(8, vo.getEndereco().getNumeroCasa());
            ptst.setString(9, vo.getEndereco().getReferencia());
            ptst.setString(10, vo.getCurso());
            ptst.setString(11, vo.getLingua());
            ptst.setInt(12, vo.getIde());
            ptst.executeUpdate();
	}catch(SQLException e) {
            e.printStackTrace();
	}
    }
    
    @Override
    public ResultSet buscaID(VO vo) {
	conn = getConnection();
	String sql = "Select * from Aluno where ide = ?";
		
	PreparedStatement ps;
	ResultSet tabela = null;
		
	try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, vo.getIde());
            tabela = ps.executeQuery();
	}
	catch(SQLException e) {
            e.printStackTrace();
	}
		
	return tabela;
    }
    
    public ResultSet listar(){
        
    }
}
