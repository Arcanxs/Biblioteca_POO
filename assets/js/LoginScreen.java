package assets.js;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginScreen() {
        setTitle("Tela de Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Crie um painel para conter os componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        // Crie e adicione rótulos e campos de texto ao painel
        JLabel usernameLabel = new JLabel("Usuário:");
        usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Senha:");
        passwordField = new JPasswordField();

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);

        // Crie um botão de login
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Verifique as credenciais de login
                if (username.equals("admin") && password.equals("12345")) {
                    JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
                    // Faça algo após o login ser bem-sucedido
                } else {
                    JOptionPane.showMessageDialog(null, "Login falhou. Tente novamente.");
                    // Faça algo em caso de falha de login
                }
            }
        });

        panel.add(new JLabel()); // célula vazia para alinhar o botão no centro
        panel.add(loginButton);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginScreen();
            }
        });
    }
}
