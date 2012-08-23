package br.ufc.si.farmacia.interfaces;

import java.util.List;

import br.ufc.si.farmacia.model.Medicamento;

public interface IMedicamentoDAO {
	public void InserirRemedio(Medicamento remedio);

	public boolean AtualizarRemedio(Medicamento remedio);

	public boolean DeletarRemedio(Medicamento remedio);

	public Medicamento RemedioPorId(Integer id);

	public List<Medicamento> ListarTodosRemedios();
	
	public List<Medicamento>ListarMedicamentosAindaEmEstoque();
	
	public List<Medicamento>ListarMedicamentosDispensados();
	
	public List<Medicamento> ListarMedicamentosVencidos();
	
	public List<Medicamento> ListarMedicamentosQueVenceraoNoMes();
}
