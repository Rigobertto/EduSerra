package eduserra.model.bo;

import eduserra.model.dao.AlunoDAO;
import eduserra.model.vo.AlunoVO;
import eduserra.model.vo.Ender;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoBO {
    private AlunoDAO dao = new AlunoDAO();
    public void cadastrar(AlunoVO aluno){
        try{
            dao.cadastrar(aluno);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void excluir(AlunoVO aluno){
        try{
            dao.excluir(aluno);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void editar(AlunoVO aluno){
        try{
            dao.editar(aluno);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public AlunoVO buscaID(int ide){
        AlunoVO aluno = new AlunoVO();
        Ender endereco = new Ender();
        
        aluno.setIde(ide);
        ResultSet pt = dao.buscaID(aluno);
        try {
            if(pt.next()) {
                aluno.setNome(pt.getString("nome"));
                aluno.setIdade(pt.getInt("idade"));
                aluno.setGenero(pt.getString("genero"));
                aluno.setTelefone(pt.getString("telefone"));
                aluno.setEmail(pt.getString("email"));
                endereco.setVila(pt.getString("vila"));
                endereco.setRua(pt.getString("rua"));
                endereco.setNumeroCasa(pt.getInt("numero"));
                endereco.setReferencia(pt.getString("referencia"));
                aluno.setEndereco(endereco);
                aluno.setLingua(pt.getString("lingua"));
                aluno.setCurso(pt.getString("curso"));
                //aluno.setCursoAprovado(pt.getString("cursoAprovado"));
                //aluno.setAprovacao(pt.getBoolean("aprovacao"));
            }
	}catch(SQLException e) {
            e.printStackTrace();
            return null;
	}
        return aluno;
    }
    
    public List listar(){
        List<AlunoVO> lista = new ArrayList<AlunoVO>();
            try{
		ResultSet tabela = dao.listar();
		while(tabela.next()) {
                    
                }
            }catch(Exception e){
                e.printStackTrace();
                return null;
            }
    }
}