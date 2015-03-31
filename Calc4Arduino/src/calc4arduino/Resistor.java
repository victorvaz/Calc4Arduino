package calc4arduino;

/**
 * Casse Resistor
 * @author Victor Vaz de Oliveira <victor-vaz@hotmail.com>
 */
public class Resistor
{
    /**
     * Calcula o valor mínimo do Resistor para proteger um LED seguramente.
     * @param alimentacao Alimentação
     * @param led LED
     * @return O valor em Ohms mínimo.
     */
    public Double calcularResistenciaNecessaria(Alimentacao alimentacao, LED led)
    {
        return (alimentacao.getCorrente() - led.getTensaoDireta()) / led.getCorrenteMaxima();
    }
}