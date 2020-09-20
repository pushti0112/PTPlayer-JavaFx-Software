package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class SampleController implements Initializable {

	@FXML
	private AnchorPane ap;
	
	@FXML
	private Button play;

	@FXML
	private Button pause;

	@FXML
	private Button mute;

	@FXML
	private Button fast;

	@FXML
	private Button stop;

	@FXML
	private MediaView mv;
	MediaPlayer mp;
	
	double speed=1;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	//	String path = "C:\\vid\\Sharato lagu (2018).mp4";
		 File f= new File("C:\\vid\\Sharato lagu (2018).mp4");
		 String M= f.toURI().toString();
		Media m = new Media(M);
		mp = new MediaPlayer(m);
		mv.setMediaPlayer(mp);
		
	//	mp.setAutoPlay(true);

	//	mp.setMute(false);
		mp.setOnReady(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				ap.setVisible(true);
				//mp.play();
			}
		});

		play.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				mp.play();

			}
		});
		pause.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				mp.pause();

			}
		});
		stop.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				mp.stop();

			}
		});
		fast.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				speed=speed+0.5;
				mp.setRate(speed);

			}
		});
		mute.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				mp.setMute(true);

			}
		});

	}

}
