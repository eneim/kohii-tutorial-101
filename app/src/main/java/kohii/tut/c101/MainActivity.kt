package kohii.tut.c101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

  companion object {
    const val videoUrl = "https://bitdash-a.akamaihd.net/content/sintel/hls/playlist.m3u8"
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }
}
