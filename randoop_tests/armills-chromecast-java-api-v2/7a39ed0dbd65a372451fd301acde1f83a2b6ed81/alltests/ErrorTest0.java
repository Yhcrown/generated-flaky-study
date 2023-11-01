import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        chromeCast2.disconnect();
        boolean boolean10 = chromeCast2.isAutoReconnect();
        chromeCast2.setAutoReconnect(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        chromeCast2.setVolume(100.0f);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        chromeCast2.disconnect();
        boolean boolean10 = chromeCast2.isAutoReconnect();
        chromeCast2.setAutoReconnect(false);
        chromeCast2.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        chromeCast2.pause();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        su.litvak.chromecast.api.v2.Media.StreamType streamType6 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        su.litvak.chromecast.api.v2.Media.StreamType streamType16 = su.litvak.chromecast.api.v2.Media.StreamType.buffered;
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        su.litvak.chromecast.api.v2.Track.TrackType trackType21 = null;
        su.litvak.chromecast.api.v2.Track track22 = new su.litvak.chromecast.api.v2.Track(1L, trackType21);
        java.lang.String str23 = track22.toString();
        long long24 = track22.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType26 = null;
        su.litvak.chromecast.api.v2.Track track27 = new su.litvak.chromecast.api.v2.Track(1L, trackType26);
        su.litvak.chromecast.api.v2.Track.TrackType trackType29 = null;
        su.litvak.chromecast.api.v2.Track track30 = new su.litvak.chromecast.api.v2.Track(1L, trackType29);
        java.lang.String str31 = track30.toString();
        long long32 = track30.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType34 = null;
        su.litvak.chromecast.api.v2.Track track35 = new su.litvak.chromecast.api.v2.Track(1L, trackType34);
        java.lang.String str36 = track35.toString();
        long long37 = track35.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType39 = null;
        su.litvak.chromecast.api.v2.Track track40 = new su.litvak.chromecast.api.v2.Track(1L, trackType39);
        long long41 = track40.id;
        su.litvak.chromecast.api.v2.Track[] trackArray42 = new su.litvak.chromecast.api.v2.Track[] { track22, track27, track30, track35, track40 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Track> trackList43 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Track>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Track>) trackList43, trackArray42);
        su.litvak.chromecast.api.v2.Media media45 = new su.litvak.chromecast.api.v2.Media("locationLongitude", "Namespace{locationName}", (java.lang.Double) 1.0d, streamType16, strMap17, strMap18, strMap19, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList43);
        java.util.Map<java.lang.String, java.lang.Object> strMap46 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap47 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap48 = null;
        su.litvak.chromecast.api.v2.Track.TrackType trackType50 = null;
        su.litvak.chromecast.api.v2.Track track51 = new su.litvak.chromecast.api.v2.Track(1L, trackType50);
        su.litvak.chromecast.api.v2.Track.TrackType trackType53 = null;
        su.litvak.chromecast.api.v2.Track track54 = new su.litvak.chromecast.api.v2.Track(1L, trackType53);
        java.lang.String str55 = track54.toString();
        long long56 = track54.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType58 = null;
        su.litvak.chromecast.api.v2.Track track59 = new su.litvak.chromecast.api.v2.Track(1L, trackType58);
        su.litvak.chromecast.api.v2.Track.TrackType trackType60 = track59.type;
        su.litvak.chromecast.api.v2.Track.TrackType trackType62 = null;
        su.litvak.chromecast.api.v2.Track track63 = new su.litvak.chromecast.api.v2.Track(1L, trackType62);
        su.litvak.chromecast.api.v2.Track[] trackArray64 = new su.litvak.chromecast.api.v2.Track[] { track51, track54, track59, track63 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Track> trackList65 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Track>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Track>) trackList65, trackArray64);
        su.litvak.chromecast.api.v2.Media media67 = new su.litvak.chromecast.api.v2.Media("Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}", "albumArtist", (java.lang.Double) 100.0d, streamType16, strMap46, strMap47, strMap48, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList65);
        su.litvak.chromecast.api.v2.Media media68 = new su.litvak.chromecast.api.v2.Media("artist", "broadcastDate", (java.lang.Double) (-1.0d), streamType6, strMap7, strMap8, strMap9, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList65);
        java.util.Map<java.lang.String, java.lang.Object> strMap69 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap70 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap71 = null;
        su.litvak.chromecast.api.v2.Media.StreamType streamType75 = su.litvak.chromecast.api.v2.Media.StreamType.live;
        java.util.Map<java.lang.String, java.lang.Object> strMap76 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap77 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap78 = null;
        su.litvak.chromecast.api.v2.Track.TrackType trackType80 = null;
        su.litvak.chromecast.api.v2.Track track81 = new su.litvak.chromecast.api.v2.Track(1L, trackType80);
        java.lang.String str82 = track81.toString();
        su.litvak.chromecast.api.v2.Track.TrackType trackType84 = null;
        su.litvak.chromecast.api.v2.Track track85 = new su.litvak.chromecast.api.v2.Track(1L, trackType84);
        su.litvak.chromecast.api.v2.Track.TrackType trackType86 = track85.type;
        java.lang.String str87 = track85.toString();
        su.litvak.chromecast.api.v2.Track[] trackArray88 = new su.litvak.chromecast.api.v2.Track[] { track81, track85 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Track> trackList89 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Track>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Track>) trackList89, trackArray88);
        su.litvak.chromecast.api.v2.Media media91 = new su.litvak.chromecast.api.v2.Media("Application{id: metadataType, name: releaseDate, sessionId: su.litvak.chromecast.api.v2.ChromeCastException: subtitle, statusText: title, transportId: Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}, isIdleScreen: false, launchedFromCloud: false, namespaces: [Namespace{discNumber}, Namespace{locationName}, Namespace{}, Namespace{}]}", "broadcastDate", (java.lang.Double) 100.0d, streamType75, strMap76, strMap77, strMap78, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList89);
        su.litvak.chromecast.api.v2.Media media92 = new su.litvak.chromecast.api.v2.Media("locationLatitude", "title", (java.lang.Double) 1.0d, streamType6, strMap69, strMap70, strMap71, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList89);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on media67 and media91", media67.equals(media91) ? media67.hashCode() == media91.hashCode() : true);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        chromeCast2.disconnect();
        boolean boolean10 = chromeCast2.isAutoReconnect();
        chromeCast2.setAutoReconnect(false);
        chromeCast2.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        su.litvak.chromecast.api.v2.Application application14 = chromeCast2.getRunningApp();
    }
}

