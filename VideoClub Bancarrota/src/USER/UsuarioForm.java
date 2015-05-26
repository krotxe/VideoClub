package USER;

import java.awt.Dialog;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;

public class UsuarioForm extends javax.swing.JFrame {

    private int contador = 0;
    HashMap<String, Pelicula> listaPelicula = new HashMap();

    public UsuarioForm() {
        initComponents();
        muestraInicio();
        conectaBase();
        conectaBase2();
    }

    private void muestraInicio() {
        pantallaInicio.setVisible(true);
        pantallaBuscar.setVisible(false);
        pantallaPrincipal.setVisible(false);
        pantallaPelicula.setVisible(false);
    }

    private void conectaBase() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            // Establecemos la conexión con la base de datos.
            Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/videoclub", "root", "");
            // Preparamos la consulta
            Statement s = conexion.createStatement();
            ResultSet rs = s.executeQuery("select * from peliculas");
            while (rs.next()) {
                Pelicula p = new Pelicula();

                p.title = rs.getString(1);
                p.year = rs.getString(2);
                p.country = rs.getString(3);
                p.gender = rs.getString(4);
                p.vote = rs.getString(6);
                p.sinopsis = rs.getString(7);

                escogePeliculas(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void escogePeliculas(Pelicula p) {

        textoGenero.setText(p.gender);
        textoAño.setText(p.year);
        textoSinopsis.setText(p.sinopsis);
        textoPais.setText(p.country);
        textoTitulo.setText(p.title);
        labelNombre.setText(p.vote);
    }

    private void conectaBase2() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // Establecemos la conexión con la base de datos.
            Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/videoclub", "root", "");
            // Preparamos la consulta
            Statement s = conexion.createStatement();
            ResultSet rs = s.executeQuery("select * from usuarios");
            while (rs.next()) {
             //   Usuarios u = new Usuarios();
              /*  u.DNI = rs.getInt(1);
                u.name = rs.getString(2);
                u.last = rs.getString(3);
                u.email = rs.getString(5);
                */
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantallaInicio = new javax.swing.JPanel();
        insertUser = new javax.swing.JTextField();
        labelPass = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        botonEntrar = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        pantallaBuscar = new javax.swing.JPanel();
        peliculaSiguiente = new javax.swing.JPanel();
        peliculaSeleccionada = new javax.swing.JPanel();
        peliculaAnterior = new javax.swing.JPanel();
        botonAnteriorPelicula = new javax.swing.JButton();
        botonSiguientePelicula = new javax.swing.JButton();
        volverPrincipalBuscar = new javax.swing.JLabel();
        pantallaPelicula = new javax.swing.JPanel();
        textoPrecio = new javax.swing.JLabel();
        botonAlquilar = new javax.swing.JButton();
        notaPelicula = new javax.swing.JLabel();
        imagenPelicula = new javax.swing.JPanel();
        textoTitulo = new javax.swing.JLabel();
        textoPais = new javax.swing.JLabel();
        textoSinopsis = new javax.swing.JLabel();
        textoGenero = new javax.swing.JLabel();
        textoAño = new javax.swing.JLabel();
        vueltaPrincipalPelicula = new javax.swing.JLabel();
        pantallaPrincipal = new javax.swing.JPanel();
        tituloPaginaPrincipal = new javax.swing.JLabel();
        imgLogo = new javax.swing.JPanel();
        topImagen1 = new javax.swing.JPanel();
        topImagen2 = new javax.swing.JPanel();
        topImagen3 = new javax.swing.JPanel();
        topPrev = new javax.swing.JButton();
        topNext = new javax.swing.JButton();
        tituloBuscaNombre = new javax.swing.JLabel();
        buscarNombrePelicula = new javax.swing.JTextField();
        boxGenero = new javax.swing.JComboBox();
        boxAño = new javax.swing.JComboBox();
        boxValoracion = new javax.swing.JComboBox();
        botonBuscar = new javax.swing.JButton();
        tituloBuscaGenero = new javax.swing.JLabel();
        tituloBuscaAño = new javax.swing.JLabel();
        tituloBuscaValoracion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pantallaInicio.setBackground(new java.awt.Color(255, 255, 255));

        labelPass.setBackground(new java.awt.Color(240, 248, 215));
        labelPass.setForeground(new java.awt.Color(51, 153, 255));
        labelPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPass.setText("Contraseña");
        labelPass.setOpaque(true);

        labelNombre.setBackground(new java.awt.Color(240, 248, 215));
        labelNombre.setForeground(new java.awt.Color(51, 153, 255));
        labelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombre.setText("Usuario");
        labelNombre.setOpaque(true);

        botonEntrar.setBackground(new java.awt.Color(211, 231, 246));
        botonEntrar.setForeground(new java.awt.Color(0, 153, 153));
        botonEntrar.setText("Entrar");
        botonEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonEntrarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pantallaInicioLayout = new javax.swing.GroupLayout(pantallaInicio);
        pantallaInicio.setLayout(pantallaInicioLayout);
        pantallaInicioLayout.setHorizontalGroup(
            pantallaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaInicioLayout.createSequentialGroup()
                .addGroup(pantallaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaInicioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pantallaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pantallaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(insertUser)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(botonEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pantallaInicioLayout.setVerticalGroup(
            pantallaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaInicioLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(pantallaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pantallaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(botonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout peliculaSiguienteLayout = new javax.swing.GroupLayout(peliculaSiguiente);
        peliculaSiguiente.setLayout(peliculaSiguienteLayout);
        peliculaSiguienteLayout.setHorizontalGroup(
            peliculaSiguienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 219, Short.MAX_VALUE)
        );
        peliculaSiguienteLayout.setVerticalGroup(
            peliculaSiguienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        peliculaSeleccionada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                peliculaSeleccionadaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout peliculaSeleccionadaLayout = new javax.swing.GroupLayout(peliculaSeleccionada);
        peliculaSeleccionada.setLayout(peliculaSeleccionadaLayout);
        peliculaSeleccionadaLayout.setHorizontalGroup(
            peliculaSeleccionadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );
        peliculaSeleccionadaLayout.setVerticalGroup(
            peliculaSeleccionadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout peliculaAnteriorLayout = new javax.swing.GroupLayout(peliculaAnterior);
        peliculaAnterior.setLayout(peliculaAnteriorLayout);
        peliculaAnteriorLayout.setHorizontalGroup(
            peliculaAnteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 241, Short.MAX_VALUE)
        );
        peliculaAnteriorLayout.setVerticalGroup(
            peliculaAnteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        botonAnteriorPelicula.setBackground(new java.awt.Color(255, 219, 246));
        botonAnteriorPelicula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonAnteriorPelicula.setForeground(new java.awt.Color(255, 102, 255));
        botonAnteriorPelicula.setText("<");

        botonSiguientePelicula.setBackground(new java.awt.Color(255, 219, 246));
        botonSiguientePelicula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonSiguientePelicula.setForeground(new java.awt.Color(255, 102, 255));
        botonSiguientePelicula.setText(">");

        volverPrincipalBuscar.setBackground(new java.awt.Color(240, 250, 207));
        volverPrincipalBuscar.setForeground(new java.awt.Color(204, 204, 0));
        volverPrincipalBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        volverPrincipalBuscar.setText("VideoClub Bancarrota");
        volverPrincipalBuscar.setOpaque(true);
        volverPrincipalBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                volverPrincipalBuscarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pantallaBuscarLayout = new javax.swing.GroupLayout(pantallaBuscar);
        pantallaBuscar.setLayout(pantallaBuscarLayout);
        pantallaBuscarLayout.setHorizontalGroup(
            pantallaBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pantallaBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(volverPrincipalBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pantallaBuscarLayout.createSequentialGroup()
                        .addComponent(peliculaSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pantallaBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pantallaBuscarLayout.createSequentialGroup()
                                .addComponent(botonAnteriorPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonSiguientePelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(peliculaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(peliculaAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
        );
        pantallaBuscarLayout.setVerticalGroup(
            pantallaBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(volverPrincipalBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pantallaBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(peliculaAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(peliculaSiguiente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(peliculaSeleccionada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pantallaBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonSiguientePelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAnteriorPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pantallaPelicula.setForeground(new java.awt.Color(204, 204, 0));

        textoPrecio.setBackground(new java.awt.Color(198, 240, 240));
        textoPrecio.setForeground(new java.awt.Color(51, 153, 255));
        textoPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoPrecio.setText("Precio");
        textoPrecio.setOpaque(true);

        botonAlquilar.setBackground(new java.awt.Color(240, 219, 242));
        botonAlquilar.setForeground(new java.awt.Color(102, 0, 102));
        botonAlquilar.setText("Alquilar");

        notaPelicula.setBackground(new java.awt.Color(198, 240, 240));
        notaPelicula.setForeground(new java.awt.Color(51, 153, 255));
        notaPelicula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notaPelicula.setText("Nota");
        notaPelicula.setOpaque(true);

        javax.swing.GroupLayout imagenPeliculaLayout = new javax.swing.GroupLayout(imagenPelicula);
        imagenPelicula.setLayout(imagenPeliculaLayout);
        imagenPeliculaLayout.setHorizontalGroup(
            imagenPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        imagenPeliculaLayout.setVerticalGroup(
            imagenPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );

        textoTitulo.setBackground(new java.awt.Color(198, 240, 240));
        textoTitulo.setForeground(new java.awt.Color(51, 153, 255));
        textoTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoTitulo.setText("Titulo");
        textoTitulo.setOpaque(true);

        textoPais.setBackground(new java.awt.Color(198, 240, 240));
        textoPais.setForeground(new java.awt.Color(51, 153, 255));
        textoPais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoPais.setText("Pais");
        textoPais.setOpaque(true);

        textoSinopsis.setBackground(new java.awt.Color(194, 249, 187));
        textoSinopsis.setForeground(new java.awt.Color(0, 102, 51));
        textoSinopsis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoSinopsis.setText("Sinopsis");

        textoGenero.setBackground(new java.awt.Color(198, 240, 240));
        textoGenero.setForeground(new java.awt.Color(51, 153, 255));
        textoGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoGenero.setText("Genero");
        textoGenero.setOpaque(true);

        textoAño.setBackground(new java.awt.Color(198, 240, 240));
        textoAño.setForeground(new java.awt.Color(51, 153, 255));
        textoAño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoAño.setText("Año");
        textoAño.setOpaque(true);

        vueltaPrincipalPelicula.setBackground(new java.awt.Color(240, 250, 207));
        vueltaPrincipalPelicula.setForeground(new java.awt.Color(204, 204, 0));
        vueltaPrincipalPelicula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vueltaPrincipalPelicula.setText("VideoClub Bancarrota");
        vueltaPrincipalPelicula.setOpaque(true);
        vueltaPrincipalPelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vueltaPrincipalPeliculaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pantallaPeliculaLayout = new javax.swing.GroupLayout(pantallaPelicula);
        pantallaPelicula.setLayout(pantallaPeliculaLayout);
        pantallaPeliculaLayout.setHorizontalGroup(
            pantallaPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaPeliculaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pantallaPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vueltaPrincipalPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pantallaPeliculaLayout.createSequentialGroup()
                        .addGroup(pantallaPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imagenPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(notaPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pantallaPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pantallaPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textoSinopsis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaPeliculaLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(textoGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                    .addGap(23, 23, 23)
                                    .addComponent(textoPais, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textoAño, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pantallaPeliculaLayout.createSequentialGroup()
                                .addComponent(botonAlquilar, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        pantallaPeliculaLayout.setVerticalGroup(
            pantallaPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaPeliculaLayout.createSequentialGroup()
                .addComponent(vueltaPrincipalPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pantallaPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pantallaPeliculaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(imagenPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pantallaPeliculaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(textoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pantallaPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoPais, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoAño, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoSinopsis, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(pantallaPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pantallaPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonAlquilar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(notaPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        tituloPaginaPrincipal.setBackground(new java.awt.Color(240, 250, 207));
        tituloPaginaPrincipal.setForeground(new java.awt.Color(204, 204, 0));
        tituloPaginaPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPaginaPrincipal.setText("VideoCLub Bancarrota");
        tituloPaginaPrincipal.setOpaque(true);
        tituloPaginaPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tituloPaginaPrincipalMousePressed(evt);
            }
        });

        javax.swing.GroupLayout imgLogoLayout = new javax.swing.GroupLayout(imgLogo);
        imgLogo.setLayout(imgLogoLayout);
        imgLogoLayout.setHorizontalGroup(
            imgLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        imgLogoLayout.setVerticalGroup(
            imgLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        topImagen1.setMaximumSize(new java.awt.Dimension(187, 250));
        topImagen1.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout topImagen1Layout = new javax.swing.GroupLayout(topImagen1);
        topImagen1.setLayout(topImagen1Layout);
        topImagen1Layout.setHorizontalGroup(
            topImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        topImagen1Layout.setVerticalGroup(
            topImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        topImagen2.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout topImagen2Layout = new javax.swing.GroupLayout(topImagen2);
        topImagen2.setLayout(topImagen2Layout);
        topImagen2Layout.setHorizontalGroup(
            topImagen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        topImagen2Layout.setVerticalGroup(
            topImagen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        topImagen3.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout topImagen3Layout = new javax.swing.GroupLayout(topImagen3);
        topImagen3.setLayout(topImagen3Layout);
        topImagen3Layout.setHorizontalGroup(
            topImagen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        topImagen3Layout.setVerticalGroup(
            topImagen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        topPrev.setBackground(new java.awt.Color(255, 219, 246));
        topPrev.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        topPrev.setForeground(new java.awt.Color(255, 102, 255));
        topPrev.setText("<");
        topPrev.setToolTipText("");

        topNext.setBackground(new java.awt.Color(255, 219, 246));
        topNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        topNext.setForeground(new java.awt.Color(255, 102, 255));
        topNext.setText(">");

        tituloBuscaNombre.setBackground(new java.awt.Color(198, 240, 240));
        tituloBuscaNombre.setForeground(new java.awt.Color(51, 153, 255));
        tituloBuscaNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBuscaNombre.setText("NOMBRE");
        tituloBuscaNombre.setOpaque(true);

        boxGenero.setBackground(new java.awt.Color(255, 217, 186));
        boxGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        boxAño.setBackground(new java.awt.Color(255, 217, 186));
        boxAño.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        boxValoracion.setBackground(new java.awt.Color(255, 217, 186));
        boxValoracion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        botonBuscar.setBackground(new java.awt.Color(240, 219, 242));
        botonBuscar.setForeground(new java.awt.Color(102, 0, 102));
        botonBuscar.setText("Buscar");
        botonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonBuscarMousePressed(evt);
            }
        });

        tituloBuscaGenero.setBackground(new java.awt.Color(198, 240, 240));
        tituloBuscaGenero.setForeground(new java.awt.Color(51, 153, 255));
        tituloBuscaGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBuscaGenero.setText("Genero");
        tituloBuscaGenero.setOpaque(true);

        tituloBuscaAño.setBackground(new java.awt.Color(198, 240, 240));
        tituloBuscaAño.setForeground(new java.awt.Color(51, 153, 255));
        tituloBuscaAño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBuscaAño.setText("Año");
        tituloBuscaAño.setOpaque(true);

        tituloBuscaValoracion.setBackground(new java.awt.Color(198, 240, 240));
        tituloBuscaValoracion.setForeground(new java.awt.Color(51, 153, 255));
        tituloBuscaValoracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBuscaValoracion.setText("Valoracion");
        tituloBuscaValoracion.setOpaque(true);

        javax.swing.GroupLayout pantallaPrincipalLayout = new javax.swing.GroupLayout(pantallaPrincipal);
        pantallaPrincipal.setLayout(pantallaPrincipalLayout);
        pantallaPrincipalLayout.setHorizontalGroup(
            pantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pantallaPrincipalLayout.createSequentialGroup()
                        .addComponent(tituloPaginaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pantallaPrincipalLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(topPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pantallaPrincipalLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(topImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(topImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(topImagen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(topNext, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pantallaPrincipalLayout.createSequentialGroup()
                                .addGroup(pantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pantallaPrincipalLayout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(tituloBuscaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaPrincipalLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tituloBuscaGenero)
                                        .addGap(32, 32, 32)
                                        .addComponent(boxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(pantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(buscarNombrePelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pantallaPrincipalLayout.createSequentialGroup()
                                        .addComponent(tituloBuscaAño, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boxAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tituloBuscaValoracion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boxValoracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                                .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)))))
                .addContainerGap())
        );
        pantallaPrincipalLayout.setVerticalGroup(
            pantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pantallaPrincipalLayout.createSequentialGroup()
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(topNext, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pantallaPrincipalLayout.createSequentialGroup()
                        .addComponent(tituloPaginaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pantallaPrincipalLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(topImagen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(topImagen3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(topImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pantallaPrincipalLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(topPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tituloBuscaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pantallaPrincipalLayout.createSequentialGroup()
                        .addComponent(buscarNombrePelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGroup(pantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pantallaPrincipalLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(pantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxAño, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxValoracion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloBuscaGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloBuscaAño, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloBuscaValoracion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pantallaPrincipalLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pantallaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pantallaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pantallaPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pantallaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pantallaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pantallaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pantallaPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pantallaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEntrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEntrarMousePressed

        char clave[] = jPasswordField1.getPassword();

        String clavedef = new String(clave);


    

        if (insertUser.getText().equals("Administrador") && clavedef.equals("")) {

            pantallaInicio.setVisible(false);
            pantallaBuscar.setVisible(false);
            pantallaPrincipal.setVisible(true);
            pantallaPelicula.setVisible(false);

        } else {

            JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                    + "Por favor ingrese un usuario y/o contraseña correctos", "Acceso denegado",
                    JOptionPane.ERROR_MESSAGE);
            pantallaInicio.setVisible(true);
        }
    

    }//GEN-LAST:event_botonEntrarMousePressed

    private void botonBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMousePressed
        pantallaInicio.setVisible(false);
        pantallaBuscar.setVisible(true);
        pantallaPrincipal.setVisible(false);
        pantallaPelicula.setVisible(false);
    }//GEN-LAST:event_botonBuscarMousePressed

    private void peliculaSeleccionadaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peliculaSeleccionadaMousePressed
        pantallaInicio.setVisible(false);
        pantallaBuscar.setVisible(false);
        pantallaPrincipal.setVisible(false);
        pantallaPelicula.setVisible(true);
    }//GEN-LAST:event_peliculaSeleccionadaMousePressed

    private void tituloPaginaPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloPaginaPrincipalMousePressed
        //Boton pantalla principal

    }//GEN-LAST:event_tituloPaginaPrincipalMousePressed

    private void volverPrincipalBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverPrincipalBuscarMousePressed

        //Vuelve desde la pantalla de busqueda a la principal
        pantallaInicio.setVisible(false);
        pantallaBuscar.setVisible(false);
        pantallaPrincipal.setVisible(true);
        pantallaPelicula.setVisible(false);
    }//GEN-LAST:event_volverPrincipalBuscarMousePressed

    private void vueltaPrincipalPeliculaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vueltaPrincipalPeliculaMousePressed
        //Vuelve de la pantalla pelicula a la pantalla principal
        pantallaInicio.setVisible(false);
        pantallaBuscar.setVisible(false);
        pantallaPrincipal.setVisible(true);
        pantallaPelicula.setVisible(false);
    }//GEN-LAST:event_vueltaPrincipalPeliculaMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                

}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UsuarioForm.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioForm.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioForm.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioForm.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAlquilar;
    private javax.swing.JButton botonAnteriorPelicula;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEntrar;
    private javax.swing.JButton botonSiguientePelicula;
    private javax.swing.JComboBox boxAño;
    private javax.swing.JComboBox boxGenero;
    private javax.swing.JComboBox boxValoracion;
    private javax.swing.JTextField buscarNombrePelicula;
    private javax.swing.JPanel imagenPelicula;
    private javax.swing.JPanel imgLogo;
    private javax.swing.JTextField insertUser;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel notaPelicula;
    private javax.swing.JPanel pantallaBuscar;
    private javax.swing.JPanel pantallaInicio;
    private javax.swing.JPanel pantallaPelicula;
    private javax.swing.JPanel pantallaPrincipal;
    private javax.swing.JPanel peliculaAnterior;
    private javax.swing.JPanel peliculaSeleccionada;
    private javax.swing.JPanel peliculaSiguiente;
    private javax.swing.JLabel textoAño;
    private javax.swing.JLabel textoGenero;
    private javax.swing.JLabel textoPais;
    private javax.swing.JLabel textoPrecio;
    private javax.swing.JLabel textoSinopsis;
    private javax.swing.JLabel textoTitulo;
    private javax.swing.JLabel tituloBuscaAño;
    private javax.swing.JLabel tituloBuscaGenero;
    private javax.swing.JLabel tituloBuscaNombre;
    private javax.swing.JLabel tituloBuscaValoracion;
    private javax.swing.JLabel tituloPaginaPrincipal;
    private javax.swing.JPanel topImagen1;
    private javax.swing.JPanel topImagen2;
    private javax.swing.JPanel topImagen3;
    private javax.swing.JButton topNext;
    private javax.swing.JButton topPrev;
    private javax.swing.JLabel volverPrincipalBuscar;
    private javax.swing.JLabel vueltaPrincipalPelicula;
    // End of variables declaration//GEN-END:variables

    

}
