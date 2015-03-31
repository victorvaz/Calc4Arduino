package calc4arduino;

/**
 * Alimentação de Energia 
 * @author Victor Vaz de Oliveira <victor-vaz@hotmail.com>
 */
public class Alimentacao
{
    /**
     * Corrente da alimentação em Volts
     */
    private Double Corrente;
    
    /**
     * O tipo de alimentação
     */
    private String TipoAlimentacao = null;

    /**
     * Retorna a corrente em Volts
     * @return the Corrente
     */
    public Double getCorrente()
    {
        if (TipoAlimentacao.equals(USB))
        {
            return 5.0;
        }
        else
        {
            return Corrente;
        }
    }

    /**
     * Define a corrente em Volts
     * @param Corrente the Corrente to set
     */
    public void setCorrente(Double Corrente)
    {
        this.Corrente = Corrente;
    }

    /**
     * Retorna o tipo de alimentação
     * @return the TipoAlimentacao
     */
    public String getTipoAlimentacao()
    {
        return TipoAlimentacao;
    }

    /**
     * Define o tipo de alimentação
     * @param TipoAlimentacao the TipoAlimentacao to set
     */
    public void setTipoAlimentacao(String TipoAlimentacao)
    {
        this.TipoAlimentacao = TipoAlimentacao;
    }
    
    /**
     * Tipo de alimentação por USB
     */
    public static String USB = "USB";
}