package io.music.spotifyclone.Controllers;

import io.music.spotifyclone.albums.Album;
import io.music.spotifyclone.albums.httpgetalbums;
import io.music.spotifyclone.search.Artists;
import io.music.spotifyclone.search.httpgetartists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AlbumController {

    @Autowired
    httpgetalbums albums;

    @Autowired
    httpgetartists artists;

    @GetMapping("/albums")
    public Album getAlbums(){
        return albums.getTotals();
    }

    @GetMapping("/artists")
    public Artists getArtists(){
        return artists.getTotals();
    }
}
