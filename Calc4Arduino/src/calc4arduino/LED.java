package calc4arduino;

/**
 * LEDs
 * @author Victor Vaz de Oliveira <victor-vaz@hotmail.com>
 */
public class LED
{
    /**
     * Corrente máxima que um LED pode suportar.
     * Medida: Amperes
     */
    private static Double CorrenteMaxima = 0.02;
    
    /**
     * Tensão direta do LED.
     * Medida: Volts
     */
    private Double TensaoDireta;
    
    /**
     * Cor do LED
     */
    private String CorLED;

    /**
     * Retorna a CorrenteMaxima em Amperes
     * @return the CorrenteMaxima
     */
    public Double getCorrenteMaxima()
    {
        return CorrenteMaxima;
    }
    
    /**
     * Retorna a TensaoDireta
     * @return the TensaoDireta
     */
    public Double getTensaoDireta()
    {
        if (CorLED.equals(LED_VERMELHO))
        {
            return 1.5;
        }
        else if (CorLED.equals(LED_AMARELO))
        {
            return 1.5;
        }
        else if (CorLED.equals(LED_LARANJA))
        {
            return 1.5;
        }
        else if (CorLED.equals(LED_VERDE))
        {
            return 2.0;
        }
        else if (CorLED.equals(LED_AZUL))
        {
            return 3.0;
        }
        else if (CorLED.equals(LED_BRANCO))
        {
            return 3.0;
        }
        else
        {
            throw new UnsupportedOperationException("Não foi definido a cor do LED.");
        }
    }

    /**
     * Retorna a Cor do LED
     * @return the CorLED
     */
    public String getCorLED()
    {
        return CorLED;
    }

    /**
     * Define a Cor do LED
     * @param CorLED the CorLED to set
     */
    public void setCorLED(String CorLED)
    {
        this.CorLED = CorLED;
    }
    
    /**
     * Cor do LED é vermelha
     */
    public static String LED_VERMELHO = "LED VERMELHO";
    
    /**
     * Cor do LED é amarela
     */
    public static String LED_AMARELO = "LED AMARELO";
    
    /**
     * Cor do LED é laranja
     */
    public static String LED_LARANJA = "LED LARANJA";
    
    /**
     * Cor do LED é verde
     */
    public static String LED_VERDE = "LED VERDE";
    
    /**
     * Cor do LED é azul
     */
    public static String LED_AZUL = "LED AZUL";
    
    /**
     * Cor do LED é branca
     */
    public static String LED_BRANCO = "LED BRANCO";
}