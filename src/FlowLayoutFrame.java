import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlowLayoutFrame extends JFrame {

	private JButton botaoEsquerdo;
	//BOTÃO PARA CONFIGURAR O ALINHAMENTO À ESQUERDA
	private JButton botaoDireito;
	//BOTÃO PARA CONFIGURAR O ALINHAMENTO À DIREITA
	private JButton botaoCentral;
	//BOTÃO PARA CONFIGURAR O ALINHAMENTO CENTRALIZADO
	private FlowLayout layout;
	//OBJETO LAYOUT
	private Container container;
	//CONTÊINER PARA CONFIGURAR LAYOUT

	//CONFIGURA GUI E REGISTRA LISTENERS DE BOTÃO
	public FlowLayoutFrame()
	{
		super("Demonstração de um FlowLayout");

		layout = new FlowLayout();		//CRIA FLOWLAYOUT
		container = getContentPane();	//OBTÊM CONTEINER PARA LAYOUT

		setLayout(layout);	//CONFIGURA O LAYOUT DE FRAME

		//CONFIGURA LEFTBUTTON E REGISTRA LISTENER
		botaoEsquerdo = new JButton("Esquerda");	//CRIA O BOTÃO LEFT
		add(botaoEsquerdo);		//ADICIONA O BOTÃO ESQUERDO AO FRAME

		botaoEsquerdo.addActionListener(new ActionListener() {
				//PROCESSA O EVENTO BOTÃO ESQUERDO
				public void actionPerformed(ActionEvent e) {
					layout.setAlignment(FlowLayout.LEFT);

					//REALINHA OS COMPONENTES ANEXADOS
					layout.layoutContainer(container);
				}
			}
		);

		//CONFIGURA O BOTÃO CENTRAL E REGISTRA O LISTENER
		botaoCentral = new JButton("Centro");	//CRIA P BOTÃO CENTRAL
		add(botaoCentral);	//ADICIONO O BOTÃO AO FRAME

		botaoCentral.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					layout.setAlignment(FlowLayout.CENTER);

					//REALINHA OS COMPONENTES ANEXADOS
					layout.layoutContainer(container);
				}
			}
		);

		//CONFIGURA O BOTÃO DIREITO E REGISTRA O LISTENER
		botaoDireito = new JButton("Direita");
		add(botaoDireito);	//ADICIONA BOTÃO

		botaoDireito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.setAlignment(FlowLayout.RIGHT);

				layout.layoutContainer(container);
			}
		}
		);
	}

	public void initialize(){
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(600, 75);	//CONFIGURA O TAMANHO DA TELA
		setVisible(true);
	}
}