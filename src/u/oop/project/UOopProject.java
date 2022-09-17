package u.oop.project;

import javafx.application.Application;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class UOopProject extends Application {

    Stage app;
    Scene startScene, dashboardScene;

    //
    Mesa mesa1;
    Trabajador mozo1;
    TableView<Cliente> clientsTable1;
    ObservableList<Cliente> clientsTableArray1 = FXCollections.observableArrayList();

    TableView<Trabajador> workersTable1;
    ObservableList<Trabajador> workersTableArray1 = FXCollections.observableArrayList();

    TableView<Plato> pedidosTable1;
    ObservableList<Plato> pedidosTableArray1 = FXCollections.observableArrayList();

    //
    Mesa mesa2;
    Trabajador mozo2;
    TableView<Cliente> clientsTable2;
    ObservableList<Cliente> clientsTableArray2 = FXCollections.observableArrayList();

    TableView<Trabajador> workersTable2;
    ObservableList<Trabajador> workersTableArray2 = FXCollections.observableArrayList();

    TableView<Plato> pedidosTable2;
    ObservableList<Plato> pedidosTableArray2 = FXCollections.observableArrayList();

    //
    Mesa mesa3;
    Trabajador mozo3;
    TableView<Cliente> clientsTable3;
    ObservableList<Cliente> clientsTableArray3 = FXCollections.observableArrayList();

    TableView<Trabajador> workersTable3;
    ObservableList<Trabajador> workersTableArray3 = FXCollections.observableArrayList();

    TableView<Plato> pedidosTable3;
    ObservableList<Plato> pedidosTableArray3 = FXCollections.observableArrayList();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        app = primaryStage;
        app.setTitle("Happy Chicken");

        // START SCENE
        Label startSceneTitle = new Label("Happy Chicken");
        startSceneTitle.getStyleClass().add("h1");
        Button startSceneButton = new Button("Iniciar sistema");
        startSceneButton.getStyleClass().add("start-button");
        startSceneButton.setOnAction(e -> {
            app.setScene(dashboardScene);
        });

        VBox titleWithButtonBox = new VBox(20);
        titleWithButtonBox.getChildren().addAll(startSceneTitle, startSceneButton);
        titleWithButtonBox.setAlignment(Pos.CENTER);

        startScene = new Scene(titleWithButtonBox, 1000, 600);
        startScene.getStylesheets().add(getClass().getResource("./styles.css").toExternalForm());
        // - START SCENE
        
        // DASHBOARD SCENE
        Label dashboardSceneTitle = new Label("Happy Chicken");
        dashboardSceneTitle.getStyleClass().add("h1");

        VBox DashboardHeaderBox = new VBox(0);
        DashboardHeaderBox.getChildren().addAll(dashboardSceneTitle);
        //DashboardHeaderBox.setPadding(new Insets(20, 0, 0, 0));
        DashboardHeaderBox.setAlignment(Pos.TOP_CENTER);

        // mesa 1
        
        mesa1 = new Mesa(
            1,
            1,
            clientsTableArray1,
            pedidosTableArray1,
            mozo1
        );
        
        Label mesaBox1Title = new Label("Mesa 1");
        mesaBox1Title.getStyleClass().add("h2");
        mesaBox1Title.setMaxWidth(Double.MAX_VALUE);
        mesaBox1Title.setAlignment(Pos.CENTER);

        // mesa 1 - clientes
        Label mesaBox1ClientsTitle = new Label("Clientes:");
        mesaBox1ClientsTitle.getStyleClass().add("h3");
        
        Button mesaBox1ClientsButton = new Button("Añadir");
        mesaBox1ClientsButton.setOnAction(e -> {
            Cliente newClient = AddClientBox.display();
            System.out.println(newClient);
            this.clientsTableArray1.add(newClient);
            mesa1.setClientes(clientsTableArray1);
            clientsTable1.getItems();
        });
        
        HBox mesaBox1ClientsTittleButtonBox = new HBox(20);
        mesaBox1ClientsTittleButtonBox.getChildren().addAll(mesaBox1ClientsTitle, mesaBox1ClientsButton);

        TableColumn<Cliente, Integer> idClientColumn1 = new TableColumn<>("Id");
        idClientColumn1.setMaxWidth(40);
        idClientColumn1.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getId()).asObject());

        TableColumn<Cliente, String> tipoDocClientColumn1 = new TableColumn<>("Tipo Doc");
        tipoDocClientColumn1.setMaxWidth(70);
        tipoDocClientColumn1.setCellValueFactory( new PropertyValueFactory<Cliente, String>("tipo_doc"));

        TableColumn<Cliente, String> numeroDocClientColumn1 = new TableColumn<>("Núm Doc");
        numeroDocClientColumn1.setMaxWidth(100);
        numeroDocClientColumn1.setCellValueFactory(new PropertyValueFactory<Cliente, String>("numero_doc"));

        TableColumn<Cliente, String> nombreClientColumn1 = new TableColumn<>("Nombre");
        nombreClientColumn1.setMaxWidth(70);
        nombreClientColumn1.setCellValueFactory(new PropertyValueFactory<>("Nombre"));

        TableColumn<Cliente, String> sexoClientColumn1 = new TableColumn<>("Sexo");
        sexoClientColumn1.setMaxWidth(50);
        sexoClientColumn1.setCellValueFactory(new PropertyValueFactory<Cliente, String>("sexo"));

        TableColumn<Cliente, String> edadClientColumn1 = new TableColumn<>("Edad");
        edadClientColumn1.setMaxWidth(50);
        edadClientColumn1.setCellValueFactory(new PropertyValueFactory<Cliente, String>("edad"));

        TableColumn<Cliente, String> celularClientColumn1 = new TableColumn<>("Celular");
        celularClientColumn1.setMaxWidth(100);
        celularClientColumn1.setCellValueFactory(new PropertyValueFactory<Cliente, String>("celular"));

        TableColumn<Cliente, String> correoClientColumn1 = new TableColumn<>("Correo");
        correoClientColumn1.setMaxWidth(100);
        correoClientColumn1.setCellValueFactory(new PropertyValueFactory<Cliente, String>("correo"));

        clientsTable1 = new TableView<>();
        clientsTable1.setItems(clientsTableArray1);
        clientsTable1.getColumns().addAll(
                //nameColumn,
                idClientColumn1, 
                tipoDocClientColumn1, 
                numeroDocClientColumn1, 
                nombreClientColumn1, 
                sexoClientColumn1, 
                edadClientColumn1, 
                celularClientColumn1, 
                correoClientColumn1
        );

        // - mesa 1 - Mozo
        Label mesaBox1WorkersTitle = new Label("Mozo:");
        mesaBox1WorkersTitle.getStyleClass().add("h3");
        
        Button mesaBox1WorkersButton = new Button("Añadir");
        mesaBox1WorkersButton.setOnAction(e -> {
            Trabajador mozoSeleccionado = AddMozoBox.display();
            System.out.println(mozoSeleccionado);
            this.workersTableArray1.add(mozoSeleccionado);
            mesa1.setTrabajador(mozoSeleccionado);
            workersTable1.getItems();
        });
        
        HBox mesaBox1WorkersTittleButtonBox = new HBox(20);
        mesaBox1WorkersTittleButtonBox.getChildren().addAll(mesaBox1WorkersTitle, mesaBox1WorkersButton);
        
        TableColumn<Trabajador, String> idWorkerColumn1 = new TableColumn<>("Id");
        idWorkerColumn1.setMaxWidth(40);
        idWorkerColumn1.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Trabajador, String> tipoDocWorkerColumn1 = new TableColumn<>("Tipo Doc");
        tipoDocWorkerColumn1.setMaxWidth(70);
        tipoDocWorkerColumn1.setCellValueFactory(new PropertyValueFactory<>("tipo_doc"));

        TableColumn<Trabajador, String> numeroDocWorkerColumn1 = new TableColumn<>("Núm Doc");
        numeroDocWorkerColumn1.setMaxWidth(100);
        numeroDocWorkerColumn1.setCellValueFactory(new PropertyValueFactory<>("numero_doc"));

        TableColumn<Trabajador, String> nombreWorkerColumn1 = new TableColumn<>("Nombre");
        nombreWorkerColumn1.setMaxWidth(70);
        nombreWorkerColumn1.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        TableColumn<Trabajador, String> sexoWorkerColumn1 = new TableColumn<>("Sexo");
        sexoWorkerColumn1.setMaxWidth(50);
        sexoWorkerColumn1.setCellValueFactory(new PropertyValueFactory<>("sexo"));

        TableColumn<Trabajador, String> edadWorkerColumn1 = new TableColumn<>("Edad");
        edadWorkerColumn1.setMaxWidth(50);
        edadWorkerColumn1.setCellValueFactory(new PropertyValueFactory<>("edad"));

        TableColumn<Trabajador, String> celularWorkerColumn1 = new TableColumn<>("Celular");
        celularWorkerColumn1.setMaxWidth(100);
        celularWorkerColumn1.setCellValueFactory(new PropertyValueFactory<>("celular"));
        
        TableColumn<Trabajador, String> cargoWorkerColumn1 = new TableColumn<>("Cargo");
        cargoWorkerColumn1.setMaxWidth(100);
        cargoWorkerColumn1.setCellValueFactory(new PropertyValueFactory<>("cargo"));
        
        TableColumn<Trabajador, String> sueldoWorkerColumn1 = new TableColumn<>("Sueldo");
        sueldoWorkerColumn1.setMaxWidth(100);
        sueldoWorkerColumn1.setCellValueFactory(new PropertyValueFactory<>("Sueldo"));


        workersTable1 = new TableView<>();
        workersTable1.setItems(workersTableArray1);
        workersTable1.getColumns().addAll(
                idWorkerColumn1, 
                tipoDocWorkerColumn1, 
                numeroDocWorkerColumn1, 
                nombreWorkerColumn1, 
                sexoWorkerColumn1, 
                edadWorkerColumn1, 
                celularWorkerColumn1, 
                cargoWorkerColumn1,
                sueldoWorkerColumn1
        );

        // mesa 1 - pedido
        Label mesaBox1PedidoTitle = new Label("Pedido:");
        mesaBox1PedidoTitle.getStyleClass().add("h3");
        
        Button mesaBox1PedidoButton = new Button("Añadir");
        mesaBox1PedidoButton.setOnAction(e -> {
            Plato platoSeleccionado = AddPlatoBox.display();
            System.out.println(platoSeleccionado);
            this.pedidosTableArray1.add(platoSeleccionado);
            mesa1.setPlatos(pedidosTableArray1);
            pedidosTable1.getItems();
        });
        
        HBox mesaBox1PedidoTittleButtonBox = new HBox(20);
        mesaBox1PedidoTittleButtonBox.getChildren().addAll(mesaBox1PedidoTitle, mesaBox1PedidoButton);
        
        TableColumn<Plato, String> idPlatoColumn1 = new TableColumn<>("Id");
        idPlatoColumn1.setMaxWidth(40);
        idPlatoColumn1.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Plato, String> tipoPlatoColumn1 = new TableColumn<>("Tipo");
        tipoPlatoColumn1.setMaxWidth(70);
        tipoPlatoColumn1.setCellValueFactory(new PropertyValueFactory<>("tipo"));

        TableColumn<Plato, String> nombrePlatoColumn1 = new TableColumn<>("Nombre");
        nombrePlatoColumn1.setMinWidth(150);
        nombrePlatoColumn1.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        TableColumn<Plato, String> precioPlatoColumn1 = new TableColumn<>("Precio");
        precioPlatoColumn1.setMaxWidth(70);
        precioPlatoColumn1.setCellValueFactory(new PropertyValueFactory<>("precio"));

        pedidosTable1 = new TableView<>();
        pedidosTable1.setItems(pedidosTableArray1);
        pedidosTable1.getColumns().addAll(
                idPlatoColumn1, 
                tipoPlatoColumn1, 
                nombrePlatoColumn1, 
                precioPlatoColumn1
        );

        // - mesa 1 - comprobante
        Button mesaBox1GenerarComprobanteButton = new Button("Generar Comprobante");
        mesaBox1GenerarComprobanteButton.setOnAction(e -> {
            boolean limpiarMesa = SeePedido.display(mesa1);
            System.out.println(limpiarMesa);
            if(limpiarMesa){
                clientsTableArray1.clear();
                workersTableArray1.clear();
                pedidosTableArray1.clear();
                mesa1 = new Mesa(
                    1,
                    1,
                    clientsTableArray1,
                    pedidosTableArray1,
                    mozo1
                );
            }
        });
        
        //
        VBox menuBox1 = new VBox(15);
        menuBox1.getChildren().addAll(
                mesaBox1Title, 
                mesaBox1ClientsTittleButtonBox,
                clientsTable1, 
                mesaBox1WorkersTittleButtonBox,
                workersTable1,
                mesaBox1PedidoTittleButtonBox,
                pedidosTable1,
                mesaBox1GenerarComprobanteButton
        );
        menuBox1.getStyleClass().add("menu-box");
        menuBox1.setPadding(new Insets(20, 20, 20, 20));
        GridPane.setConstraints(menuBox1, 0, 0);

        // - mesa 1
        
        // mesa 2
        
        mesa2 = new Mesa(
            2,
            2,
            clientsTableArray2,
            pedidosTableArray2,
            mozo2
        );
        
        Label mesaBox2Title = new Label("Mesa 2");
        mesaBox2Title.getStyleClass().add("h2");
        mesaBox2Title.setMaxWidth(Double.MAX_VALUE);
        mesaBox2Title.setAlignment(Pos.CENTER);

        // mesa 2 - clientes
        Label mesaBox2ClientsTitle = new Label("Clientes:");
        mesaBox2ClientsTitle.getStyleClass().add("h3");
        
        
        Button mesaBox2ClientsButton = new Button("Añadir");
        mesaBox2ClientsButton.setOnAction(e -> {
            Cliente newClient = AddClientBox.display();
            System.out.println(newClient);
            this.clientsTableArray2.add(newClient);
            mesa2.setClientes(clientsTableArray2);
            clientsTable2.getItems();
        });
        
        HBox mesaBox2ClientsTittleButtonBox = new HBox(20);
        mesaBox2ClientsTittleButtonBox.getChildren().addAll(mesaBox2ClientsTitle, mesaBox2ClientsButton);
        
        TableColumn<Cliente, String> idClientColumn2 = new TableColumn<>("Id");
        idClientColumn2.setMaxWidth(40);
        idClientColumn2.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Cliente, String> tipoDocClientColumn2 = new TableColumn<>("Tipo Doc");
        tipoDocClientColumn2.setMaxWidth(70);
        tipoDocClientColumn2.setCellValueFactory(new PropertyValueFactory<>("tipo_doc"));

        TableColumn<Cliente, String> numeroDocClientColumn2 = new TableColumn<>("Núm Doc");
        numeroDocClientColumn2.setMaxWidth(100);
        numeroDocClientColumn2.setCellValueFactory(new PropertyValueFactory<>("numero_doc"));

        TableColumn<Cliente, String> nombreClientColumn2 = new TableColumn<>("Nombre");
        nombreClientColumn2.setMaxWidth(70);
        nombreClientColumn2.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        TableColumn<Cliente, String> sexoClientColumn2 = new TableColumn<>("Sexo");
        sexoClientColumn2.setMaxWidth(50);
        sexoClientColumn2.setCellValueFactory(new PropertyValueFactory<>("sexo"));

        TableColumn<Cliente, String> edadClientColumn2 = new TableColumn<>("Edad");
        edadClientColumn2.setMaxWidth(50);
        edadClientColumn2.setCellValueFactory(new PropertyValueFactory<>("edad"));

        TableColumn<Cliente, String> celularClientColumn2 = new TableColumn<>("Celular");
        celularClientColumn2.setMaxWidth(100);
        celularClientColumn2.setCellValueFactory(new PropertyValueFactory<>("celular"));

        TableColumn<Cliente, String> correoClientColumn2 = new TableColumn<>("Correo");
        correoClientColumn2.setMaxWidth(100);
        correoClientColumn2.setCellValueFactory(new PropertyValueFactory<>("correo"));

        clientsTable2 = new TableView<>();
        clientsTable2.setItems(clientsTableArray2);
        clientsTable2.getColumns().addAll(
                idClientColumn2, 
                tipoDocClientColumn2, 
                numeroDocClientColumn2, 
                nombreClientColumn2, 
                sexoClientColumn2, 
                edadClientColumn2, 
                celularClientColumn2, 
                correoClientColumn2
        );

        // mesa 2 - Mozo
        Label mesaBox2WorkersTitle = new Label("Mozo:");
        mesaBox2WorkersTitle.getStyleClass().add("h3");
        
        Button mesaBox2WorkersButton = new Button("Añadir");
        mesaBox2WorkersButton.setOnAction(e -> {
            Trabajador mozoSeleccionado = AddMozoBox.display();
            System.out.println(mozoSeleccionado);
            this.workersTableArray2.add(mozoSeleccionado);
            mesa2.setTrabajador(mozoSeleccionado);
            workersTable2.getItems();
        });
        
        HBox mesaBox2WorkersTittleButtonBox = new HBox(20);
        mesaBox2WorkersTittleButtonBox.getChildren().addAll(mesaBox2WorkersTitle, mesaBox2WorkersButton);
        
        TableColumn<Trabajador, String> idWorkerColumn2 = new TableColumn<>("Id");
        idWorkerColumn2.setMaxWidth(40);
        idWorkerColumn2.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Trabajador, String> tipoDocWorkerColumn2 = new TableColumn<>("Tipo Doc");
        tipoDocWorkerColumn2.setMaxWidth(70);
        tipoDocWorkerColumn2.setCellValueFactory(new PropertyValueFactory<>("tipo_doc"));

        TableColumn<Trabajador, String> numeroDocWorkerColumn2 = new TableColumn<>("Núm Doc");
        numeroDocWorkerColumn2.setMaxWidth(100);
        numeroDocWorkerColumn2.setCellValueFactory(new PropertyValueFactory<>("numero_doc"));

        TableColumn<Trabajador, String> nombreWorkerColumn2 = new TableColumn<>("Nombre");
        nombreWorkerColumn2.setMaxWidth(70);
        nombreWorkerColumn2.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        TableColumn<Trabajador, String> sexoWorkerColumn2 = new TableColumn<>("Sexo");
        sexoWorkerColumn2.setMaxWidth(50);
        sexoWorkerColumn2.setCellValueFactory(new PropertyValueFactory<>("sexo"));

        TableColumn<Trabajador, String> edadWorkerColumn2 = new TableColumn<>("Edad");
        edadWorkerColumn2.setMaxWidth(50);
        edadWorkerColumn2.setCellValueFactory(new PropertyValueFactory<>("edad"));

        TableColumn<Trabajador, String> celularWorkerColumn2 = new TableColumn<>("Celular");
        celularWorkerColumn2.setMaxWidth(100);
        celularWorkerColumn2.setCellValueFactory(new PropertyValueFactory<>("celular"));
        
        TableColumn<Trabajador, String> cargoWorkerColumn2 = new TableColumn<>("Cargo");
        cargoWorkerColumn2.setMaxWidth(100);
        cargoWorkerColumn2.setCellValueFactory(new PropertyValueFactory<>("cargo"));
        
        TableColumn<Trabajador, String> sueldoWorkerColumn2 = new TableColumn<>("Sueldo");
        sueldoWorkerColumn2.setMaxWidth(100);
        sueldoWorkerColumn2.setCellValueFactory(new PropertyValueFactory<>("Sueldo"));


        workersTable2 = new TableView<>();
        workersTable2.setItems(workersTableArray2);
        workersTable2.getColumns().addAll(
                idWorkerColumn2, 
                tipoDocWorkerColumn2, 
                numeroDocWorkerColumn2, 
                nombreWorkerColumn2, 
                sexoWorkerColumn2, 
                edadWorkerColumn2, 
                celularWorkerColumn2, 
                cargoWorkerColumn2,
                sueldoWorkerColumn2
        );

        // mesa 2 - pedido
        Label mesaBox2PedidoTitle = new Label("Pedido:");
        mesaBox2PedidoTitle.getStyleClass().add("h3");
        
        Button mesaBox2PedidoButton = new Button("Añadir");
        mesaBox2PedidoButton.setOnAction(e -> {
            Plato platoSeleccionado = AddPlatoBox.display();
            System.out.println(platoSeleccionado);
            this.pedidosTableArray2.add(platoSeleccionado);
            mesa2.setPlatos(pedidosTableArray2);
            pedidosTable2.getItems();
        });
        
        HBox mesaBox2PedidoTittleButtonBox = new HBox(20);
        mesaBox2PedidoTittleButtonBox.getChildren().addAll(mesaBox2PedidoTitle, mesaBox2PedidoButton);
        
        TableColumn<Plato, String> idPlatoColumn2 = new TableColumn<>("Id");
        idPlatoColumn2.setMaxWidth(40);
        idPlatoColumn2.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Plato, String> tipoPlatoColumn2 = new TableColumn<>("Tipo");
        tipoPlatoColumn2.setMaxWidth(70);
        tipoPlatoColumn2.setCellValueFactory(new PropertyValueFactory<>("tipo"));

        TableColumn<Plato, String> nombrePlatoColumn2 = new TableColumn<>("Nombre");
        nombrePlatoColumn2.setMinWidth(150);
        nombrePlatoColumn2.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        TableColumn<Plato, String> precioPlatoColumn2 = new TableColumn<>("Precio");
        precioPlatoColumn2.setMaxWidth(70);
        precioPlatoColumn2.setCellValueFactory(new PropertyValueFactory<>("precio"));

        pedidosTable2 = new TableView<>();
        pedidosTable2.setItems(pedidosTableArray2);
        pedidosTable2.getColumns().addAll(
                idPlatoColumn2, 
                tipoPlatoColumn2, 
                nombrePlatoColumn2, 
                precioPlatoColumn2
        );

        // - mesa 2 - comprobante
        Button mesaBox2GenerarComprobanteButton = new Button("Generar Comprobante");
        mesaBox2GenerarComprobanteButton.setOnAction(e -> {
            boolean limpiarMesa = SeePedido.display(mesa2);
            System.out.println(limpiarMesa);
            if(limpiarMesa){
                clientsTableArray2.clear();
                workersTableArray2.clear();
                pedidosTableArray2.clear();
                mesa2 = new Mesa(
                    2,
                    2,
                    clientsTableArray2,
                    pedidosTableArray2,
                    mozo2
                );
            }
        });

        //
        VBox mesaBox2 = new VBox(15);
        mesaBox2.getChildren().addAll(
                mesaBox2Title,
                mesaBox2ClientsTittleButtonBox,
                clientsTable2,
                mesaBox2WorkersTittleButtonBox,
                workersTable2,
                mesaBox2PedidoTittleButtonBox,
                pedidosTable2, 
                mesaBox2GenerarComprobanteButton
        );
        mesaBox2.getStyleClass().add("menu-box");
        mesaBox2.setPadding(new Insets(20, 20, 20, 20));
        GridPane.setConstraints(mesaBox2, 1, 0);

        // - mesa 2
        
        // mesa 3
        
        mesa3 = new Mesa(
            3,
            3,
            clientsTableArray3,
            pedidosTableArray3,
            mozo2
        );
        
        Label mesaBox3Title = new Label("Mesa 3");
        mesaBox3Title.getStyleClass().add("h2");
        mesaBox3Title.setMaxWidth(Double.MAX_VALUE);
        mesaBox3Title.setAlignment(Pos.CENTER);

        // mesa 3 - clientes
        Label mesaBox3ClientsTitle = new Label("Clientes:");
        mesaBox3ClientsTitle.getStyleClass().add("h3");
        
        Button mesaBox3ClientsButton = new Button("Añadir");
        mesaBox3ClientsButton.setOnAction(e -> {
            Cliente newClient = AddClientBox.display();
            System.out.println(newClient);
            this.clientsTableArray3.add(newClient);
            mesa3.setClientes(clientsTableArray3);
            clientsTable3.getItems();
        });
        
        HBox mesaBox3ClientsTittleButtonBox = new HBox(20);
        mesaBox3ClientsTittleButtonBox.getChildren().addAll(mesaBox3ClientsTitle, mesaBox3ClientsButton);
        
        TableColumn<Cliente, String> idClientColumn3 = new TableColumn<>("Id");
        idClientColumn3.setMaxWidth(40);
        idClientColumn3.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Cliente, String> tipoDocClientColumn3 = new TableColumn<>("Tipo Doc");
        tipoDocClientColumn3.setMaxWidth(70);
        tipoDocClientColumn3.setCellValueFactory(new PropertyValueFactory<>("tipo_doc"));

        TableColumn<Cliente, String> numeroDocClientColumn3 = new TableColumn<>("Núm Doc");
        numeroDocClientColumn3.setMaxWidth(100);
        numeroDocClientColumn3.setCellValueFactory(new PropertyValueFactory<>("numero_doc"));

        TableColumn<Cliente, String> nombreClientColumn3 = new TableColumn<>("Nombre");
        nombreClientColumn3.setMaxWidth(70);
        nombreClientColumn3.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        TableColumn<Cliente, String> sexoClientColumn3 = new TableColumn<>("Sexo");
        sexoClientColumn3.setMaxWidth(50);
        sexoClientColumn3.setCellValueFactory(new PropertyValueFactory<>("sexo"));

        TableColumn<Cliente, String> edadClientColumn3 = new TableColumn<>("Edad");
        edadClientColumn3.setMaxWidth(50);
        edadClientColumn3.setCellValueFactory(new PropertyValueFactory<>("edad"));

        TableColumn<Cliente, String> celularClientColumn3 = new TableColumn<>("Celular");
        celularClientColumn3.setMaxWidth(100);
        celularClientColumn3.setCellValueFactory(new PropertyValueFactory<>("celular"));

        TableColumn<Cliente, String> correoClientColumn3 = new TableColumn<>("Correo");
        correoClientColumn3.setMaxWidth(100);
        correoClientColumn3.setCellValueFactory(new PropertyValueFactory<>("correo"));

        clientsTable3 = new TableView<>();
        clientsTable3.setItems(clientsTableArray3);
        clientsTable3.getColumns().addAll(
                idClientColumn3, 
                tipoDocClientColumn3, 
                numeroDocClientColumn3, 
                nombreClientColumn3, 
                sexoClientColumn3, 
                edadClientColumn3, 
                celularClientColumn3, 
                correoClientColumn3
        );

        // - mesa 3 - Mozo
        Label mesaBox3WorkersTitle = new Label("Mozo:");
        mesaBox3WorkersTitle.getStyleClass().add("h3");
        
        Button mesaBox3WorkersButton = new Button("Añadir");
        mesaBox3WorkersButton.setOnAction(e -> {
            Trabajador mozoSeleccionado = AddMozoBox.display();
            System.out.println(mozoSeleccionado);
            this.workersTableArray3.add(mozoSeleccionado);
            mesa3.setTrabajador(mozoSeleccionado);
            workersTable3.getItems();
        });
        
        HBox mesaBox3WorkersTittleButtonBox = new HBox(20);
        mesaBox3WorkersTittleButtonBox.getChildren().addAll(mesaBox3WorkersTitle, mesaBox3WorkersButton);
        
        TableColumn<Trabajador, String> idWorkerColumn3 = new TableColumn<>("Id");
        idWorkerColumn3.setMaxWidth(40);
        idWorkerColumn3.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Trabajador, String> tipoDocWorkerColumn3 = new TableColumn<>("Tipo Doc");
        tipoDocWorkerColumn3.setMaxWidth(70);
        tipoDocWorkerColumn3.setCellValueFactory(new PropertyValueFactory<>("tipo_doc"));

        TableColumn<Trabajador, String> numeroDocWorkerColumn3 = new TableColumn<>("Núm Doc");
        numeroDocWorkerColumn3.setMaxWidth(100);
        numeroDocWorkerColumn3.setCellValueFactory(new PropertyValueFactory<>("numero_doc"));

        TableColumn<Trabajador, String> nombreWorkerColumn3 = new TableColumn<>("Nombre");
        nombreWorkerColumn3.setMaxWidth(70);
        nombreWorkerColumn3.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        TableColumn<Trabajador, String> sexoWorkerColumn3 = new TableColumn<>("Sexo");
        sexoWorkerColumn3.setMaxWidth(50);
        sexoWorkerColumn3.setCellValueFactory(new PropertyValueFactory<>("sexo"));

        TableColumn<Trabajador, String> edadWorkerColumn3 = new TableColumn<>("Edad");
        edadWorkerColumn3.setMaxWidth(50);
        edadWorkerColumn3.setCellValueFactory(new PropertyValueFactory<>("edad"));

        TableColumn<Trabajador, String> celularWorkerColumn3 = new TableColumn<>("Celular");
        celularWorkerColumn3.setMaxWidth(100);
        celularWorkerColumn3.setCellValueFactory(new PropertyValueFactory<>("celular"));
        
        TableColumn<Trabajador, String> cargoWorkerColumn3 = new TableColumn<>("Cargo");
        cargoWorkerColumn3.setMaxWidth(100);
        cargoWorkerColumn3.setCellValueFactory(new PropertyValueFactory<>("cargo"));
        
        TableColumn<Trabajador, String> sueldoWorkerColumn3 = new TableColumn<>("Sueldo");
        sueldoWorkerColumn3.setMaxWidth(100);
        sueldoWorkerColumn3.setCellValueFactory(new PropertyValueFactory<>("Sueldo"));


        workersTable3 = new TableView<>();
        workersTable3.setItems(workersTableArray3);
        workersTable3.getColumns().addAll(
                idWorkerColumn3, 
                tipoDocWorkerColumn3, 
                numeroDocWorkerColumn3, 
                nombreWorkerColumn3, 
                sexoWorkerColumn3, 
                edadWorkerColumn3, 
                celularWorkerColumn3, 
                cargoWorkerColumn3,
                sueldoWorkerColumn3
        );

        // mesa 3 - pedido
        Label mesaBox3PedidoTitle = new Label("Pedido:");
        mesaBox3PedidoTitle.getStyleClass().add("h3");
        
        Button mesaBox3PedidoButton = new Button("Añadir");
        mesaBox3PedidoButton.setOnAction(e -> {
            Plato platoSeleccionado = AddPlatoBox.display();
            System.out.println(platoSeleccionado);
            this.pedidosTableArray3.add(platoSeleccionado);
            mesa3.setPlatos(pedidosTableArray3);
            pedidosTable3.getItems();
        });
        
        HBox mesaBox3PedidoTittleButtonBox = new HBox(20);
        mesaBox3PedidoTittleButtonBox.getChildren().addAll(mesaBox3PedidoTitle, mesaBox3PedidoButton);
        
        TableColumn<Plato, String> idPlatoColumn3 = new TableColumn<>("Id");
        idPlatoColumn3.setMaxWidth(40);
        idPlatoColumn3.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Plato, String> tipoPlatoColumn3 = new TableColumn<>("Tipo");
        tipoPlatoColumn3.setMaxWidth(70);
        tipoPlatoColumn3.setCellValueFactory(new PropertyValueFactory<>("tipo"));

        TableColumn<Plato, String> nombrePlatoColumn3 = new TableColumn<>("Nombre");
        nombrePlatoColumn3.setMinWidth(150);
        nombrePlatoColumn3.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        TableColumn<Plato, String> precioPlatoColumn3 = new TableColumn<>("Precio");
        precioPlatoColumn3.setMaxWidth(70);
        precioPlatoColumn3.setCellValueFactory(new PropertyValueFactory<>("precio"));

        pedidosTable3 = new TableView<>();
        pedidosTable3.setItems(pedidosTableArray3);
        pedidosTable3.getColumns().addAll(
                idPlatoColumn3, 
                tipoPlatoColumn3, 
                nombrePlatoColumn3, 
                precioPlatoColumn3
        );
        
        // - mesa 3 - comprobante
        Button mesaBox3GenerarComprobanteButton = new Button("Generar Comprobante");
        mesaBox3GenerarComprobanteButton.setOnAction(e -> {
            boolean limpiarMesa = SeePedido.display(mesa3);
            System.out.println(limpiarMesa);
            if(limpiarMesa){
                clientsTableArray3.clear();
                workersTableArray3.clear();
                pedidosTableArray3.clear();
                mesa3 = new Mesa(
                    3,
                    3,
                    clientsTableArray3,
                    pedidosTableArray3,
                    mozo3
                );
            }
        });

        //
        VBox mesaBox3 = new VBox(15);
        mesaBox3.getChildren().addAll(
                mesaBox3Title,
                mesaBox3ClientsTittleButtonBox,
                clientsTable3,
                mesaBox3WorkersTittleButtonBox,
                workersTable3,
                mesaBox3PedidoTittleButtonBox,
                pedidosTable3,
                mesaBox3GenerarComprobanteButton
        );
        mesaBox3.getStyleClass().add("menu-box");
        mesaBox3.setPadding(new Insets(20, 20, 20, 20));
        GridPane.setConstraints(mesaBox3, 2, 0);

        // - mesa 3
        GridPane DashboardMainGrid = new GridPane();
        //DashboardMainGrid.setPadding(new Insets(0, 0, 0, 0));
        DashboardMainGrid.setHgap(20);
        DashboardMainGrid.setAlignment(Pos.CENTER);
        DashboardMainGrid.getChildren().addAll(
                menuBox1, 
                mesaBox2, 
                mesaBox3
        );

        VBox dashboardContainer = new VBox(25);
        dashboardContainer.setPadding(new Insets(20, 20, 20, 20));
        dashboardContainer.getChildren().addAll(
                DashboardHeaderBox, 
                DashboardMainGrid
        );

        dashboardScene = new Scene(dashboardContainer, 1200, 800);
        dashboardScene.getStylesheets().add(getClass().getResource("./styles.css").toExternalForm());

        // - DASHBOARD SCENE
        
        app.setScene(startScene);
        app.show();
    }
    
    public ObservableList<Cliente> getCliente1(){
        ObservableList<Cliente> clientes1 = FXCollections.observableArrayList();
        clientes1.add(new Cliente("d", 2, "d", 3, "das", "das", 2, 222));
        return clientes1;
    }
}
