import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestGroup100Case0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test001");
        java.lang.String str0 = su.litvak.chromecast.api.v2.Media.METADATA_STUDIO;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "studio" + "'", str0, "studio");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.lang.String str0 = su.litvak.chromecast.api.v2.Media.METADATA_LOCATION_LATITUDE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "locationLatitude" + "'", str0, "locationLatitude");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.lang.String str0 = su.litvak.chromecast.api.v2.Media.METADATA_COMPOSER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "composer" + "'", str0, "composer");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.lang.String str0 = su.litvak.chromecast.api.v2.Media.METADATA_LOCATION_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "locationName" + "'", str0, "locationName");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.lang.String str0 = su.litvak.chromecast.api.v2.Media.METADATA_WIDTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "width" + "'", str0, "width");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        su.litvak.chromecast.api.v2.MediaStatus.IdleReason idleReason0 = su.litvak.chromecast.api.v2.MediaStatus.IdleReason.INTERRUPTED;
        org.junit.Assert.assertTrue("'" + idleReason0 + "' != '" + su.litvak.chromecast.api.v2.MediaStatus.IdleReason.INTERRUPTED + "'", idleReason0.equals(su.litvak.chromecast.api.v2.MediaStatus.IdleReason.INTERRUPTED));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.lang.String str0 = su.litvak.chromecast.api.v2.Media.METADATA_SUBTITLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "subtitle" + "'", str0, "subtitle");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent.SpontaneousEventType spontaneousEventType0 = su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent.SpontaneousEventType.APPEVENT;
        org.junit.Assert.assertTrue("'" + spontaneousEventType0 + "' != '" + su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent.SpontaneousEventType.APPEVENT + "'", spontaneousEventType0.equals(su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent.SpontaneousEventType.APPEVENT));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        su.litvak.chromecast.api.v2.ChromeCasts.stopDiscovery();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.lang.String str0 = su.litvak.chromecast.api.v2.Media.METADATA_CREATION_DATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "creationDate" + "'", str0, "creationDate");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        su.litvak.chromecast.api.v2.Media.MetadataType metadataType0 = su.litvak.chromecast.api.v2.Media.MetadataType.MUSIC_TRACK;
        org.junit.Assert.assertTrue("'" + metadataType0 + "' != '" + su.litvak.chromecast.api.v2.Media.MetadataType.MUSIC_TRACK + "'", metadataType0.equals(su.litvak.chromecast.api.v2.Media.MetadataType.MUSIC_TRACK));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.String str0 = su.litvak.chromecast.api.v2.Media.METADATA_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "metadataType" + "'", str0, "metadataType");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        su.litvak.chromecast.api.v2.MediaStatus.PlayerState playerState0 = su.litvak.chromecast.api.v2.MediaStatus.PlayerState.PLAYING;
        org.junit.Assert.assertTrue("'" + playerState0 + "' != '" + su.litvak.chromecast.api.v2.MediaStatus.PlayerState.PLAYING + "'", playerState0.equals(su.litvak.chromecast.api.v2.MediaStatus.PlayerState.PLAYING));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.lang.String str0 = su.litvak.chromecast.api.v2.Media.METADATA_HEIGHT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "height" + "'", str0, "height");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        su.litvak.chromecast.api.v2.Track.TrackType trackType0 = su.litvak.chromecast.api.v2.Track.TrackType.TEXT;
        org.junit.Assert.assertTrue("'" + trackType0 + "' != '" + su.litvak.chromecast.api.v2.Track.TrackType.TEXT + "'", trackType0.equals(su.litvak.chromecast.api.v2.Track.TrackType.TEXT));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        su.litvak.chromecast.api.v2.Media.MetadataType metadataType0 = su.litvak.chromecast.api.v2.Media.MetadataType.PHOTO;
        org.junit.Assert.assertTrue("'" + metadataType0 + "' != '" + su.litvak.chromecast.api.v2.Media.MetadataType.PHOTO + "'", metadataType0.equals(su.litvak.chromecast.api.v2.Media.MetadataType.PHOTO));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.lang.String str0 = su.litvak.chromecast.api.v2.Media.METADATA_EPISODE_NUMBER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "episodeNumber" + "'", str0, "episodeNumber");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        su.litvak.chromecast.api.v2.Media.MetadataType metadataType0 = su.litvak.chromecast.api.v2.Media.MetadataType.MOVIE;
        org.junit.Assert.assertTrue("'" + metadataType0 + "' != '" + su.litvak.chromecast.api.v2.Media.MetadataType.MOVIE + "'", metadataType0.equals(su.litvak.chromecast.api.v2.Media.MetadataType.MOVIE));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.stopApp();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.lang.String str0 = su.litvak.chromecast.api.v2.Media.METADATA_ALBUM_ARTIST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "albumArtist" + "'", str0, "albumArtist");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.lang.String str0 = su.litvak.chromecast.api.v2.Media.METADATA_LOCATION_LONGITUDE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "locationLongitude" + "'", str0, "locationLongitude");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        su.litvak.chromecast.api.v2.Track.TrackType trackType0 = su.litvak.chromecast.api.v2.Track.TrackType.AUDIO;
        org.junit.Assert.assertTrue("'" + trackType0 + "' != '" + su.litvak.chromecast.api.v2.Track.TrackType.AUDIO + "'", trackType0.equals(su.litvak.chromecast.api.v2.Track.TrackType.AUDIO));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        su.litvak.chromecast.api.v2.MediaStatus.RepeatMode repeatMode0 = su.litvak.chromecast.api.v2.MediaStatus.RepeatMode.REPEAT_SINGLE;
        org.junit.Assert.assertTrue("'" + repeatMode0 + "' != '" + su.litvak.chromecast.api.v2.MediaStatus.RepeatMode.REPEAT_SINGLE + "'", repeatMode0.equals(su.litvak.chromecast.api.v2.MediaStatus.RepeatMode.REPEAT_SINGLE));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        su.litvak.chromecast.api.v2.MediaStatus.IdleReason idleReason0 = su.litvak.chromecast.api.v2.MediaStatus.IdleReason.CANCELLED;
        org.junit.Assert.assertTrue("'" + idleReason0 + "' != '" + su.litvak.chromecast.api.v2.MediaStatus.IdleReason.CANCELLED + "'", idleReason0.equals(su.litvak.chromecast.api.v2.MediaStatus.IdleReason.CANCELLED));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent.SpontaneousEventType spontaneousEventType0 = su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent.SpontaneousEventType.MEDIA_STATUS;
        java.lang.Class<?> wildcardClass1 = spontaneousEventType0.getDataClass();
        org.junit.Assert.assertTrue("'" + spontaneousEventType0 + "' != '" + su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent.SpontaneousEventType.MEDIA_STATUS + "'", spontaneousEventType0.equals(su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent.SpontaneousEventType.MEDIA_STATUS));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        su.litvak.chromecast.api.v2.MediaStatus.RepeatMode repeatMode0 = su.litvak.chromecast.api.v2.MediaStatus.RepeatMode.REPEAT_ALL;
        org.junit.Assert.assertTrue("'" + repeatMode0 + "' != '" + su.litvak.chromecast.api.v2.MediaStatus.RepeatMode.REPEAT_ALL + "'", repeatMode0.equals(su.litvak.chromecast.api.v2.MediaStatus.RepeatMode.REPEAT_ALL));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        int int3 = chromeCast2.getPort();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.seek((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.net.InetAddress inetAddress0 = null;
        su.litvak.chromecast.api.v2.ChromeCasts.startDiscovery(inetAddress0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.lang.String str0 = su.litvak.chromecast.api.v2.ChromeCast.SERVICE_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "_googlecast._tcp.local." + "'", str0, "_googlecast._tcp.local.");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        int int3 = chromeCast2.getPort();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.setVolumeByIncrement((float) 10L);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        su.litvak.chromecast.api.v2.MediaStatus.RepeatMode repeatMode0 = su.litvak.chromecast.api.v2.MediaStatus.RepeatMode.REPEAT_OFF;
        org.junit.Assert.assertTrue("'" + repeatMode0 + "' != '" + su.litvak.chromecast.api.v2.MediaStatus.RepeatMode.REPEAT_OFF + "'", repeatMode0.equals(su.litvak.chromecast.api.v2.MediaStatus.RepeatMode.REPEAT_OFF));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        java.lang.String str0 = su.litvak.chromecast.api.v2.Media.METADATA_IMAGES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "images" + "'", str0, "images");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        java.lang.String str3 = chromeCast2.getName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = chromeCast2.isAppAvailable("composer");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        java.lang.String str0 = su.litvak.chromecast.api.v2.Media.METADATA_RELEASE_DATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "releaseDate" + "'", str0, "releaseDate");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        java.lang.String str0 = su.litvak.chromecast.api.v2.Media.METADATA_BROADCAST_DATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "broadcastDate" + "'", str0, "broadcastDate");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        su.litvak.chromecast.api.v2.ChromeCastsListener chromeCastsListener0 = null;
        su.litvak.chromecast.api.v2.ChromeCasts.registerListener(chromeCastsListener0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        int int3 = chromeCast2.getPort();
        java.lang.String str4 = chromeCast2.getAddress();
        chromeCast2.setName("episodeNumber");
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.setVolumeByIncrement((float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        su.litvak.chromecast.api.v2.Media.MetadataType metadataType0 = su.litvak.chromecast.api.v2.Media.MetadataType.GENERIC;
        org.junit.Assert.assertTrue("'" + metadataType0 + "' != '" + su.litvak.chromecast.api.v2.Media.MetadataType.GENERIC + "'", metadataType0.equals(su.litvak.chromecast.api.v2.Media.MetadataType.GENERIC));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        int int3 = chromeCast2.getPort();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.seek((double) 100);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        java.lang.String str3 = chromeCast2.toString();
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.MediaStatus mediaStatus8 = chromeCast2.load("creationDate", "images", "locationLongitude", "creationDate");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str3, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        java.util.List<su.litvak.chromecast.api.v2.ChromeCast> chromeCastList0 = su.litvak.chromecast.api.v2.ChromeCasts.get();
        org.junit.Assert.assertNotNull(chromeCastList0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.pause();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        chromeCast2.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.setVolumeByIncrement((float) '#');
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        su.litvak.chromecast.api.v2.ChromeCastsListener chromeCastsListener0 = null;
        su.litvak.chromecast.api.v2.ChromeCasts.unregisterListener(chromeCastsListener0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        java.lang.String str3 = chromeCast2.toString();
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.MediaStatus mediaStatus5 = chromeCast2.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str3, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        int int3 = chromeCast2.getPort();
        java.lang.String str4 = chromeCast2.getAddress();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.seek((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        int int3 = chromeCast2.getPort();
        java.lang.String str4 = chromeCast2.getAddress();
        chromeCast2.setName("episodeNumber");
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.MediaStatus mediaStatus11 = chromeCast2.load("albumArtist", "creationDate", "_googlecast._tcp.local.", "metadataType");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.Status status5 = chromeCast2.getStatus();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        chromeCast2.disconnect();
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener6 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener6);
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.stopApp();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        su.litvak.chromecast.api.v2.MediaStatus.RepeatMode repeatMode0 = su.litvak.chromecast.api.v2.MediaStatus.RepeatMode.REPEAT_ALL_AND_SHUFFLE;
        org.junit.Assert.assertTrue("'" + repeatMode0 + "' != '" + su.litvak.chromecast.api.v2.MediaStatus.RepeatMode.REPEAT_ALL_AND_SHUFFLE + "'", repeatMode0.equals(su.litvak.chromecast.api.v2.MediaStatus.RepeatMode.REPEAT_ALL_AND_SHUFFLE));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.MediaStatus mediaStatus9 = chromeCast2.load("episodeNumber");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        int int3 = chromeCast2.getPort();
        java.lang.String str4 = chromeCast2.getAddress();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.setVolume((float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        java.lang.String str3 = chromeCast2.getName();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.setVolumeByIncrement(0.05f);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast1 = new su.litvak.chromecast.api.v2.ChromeCast("metadataType");
        java.lang.String str2 = chromeCast1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: metadataType, port: 8009}" + "'", str2, "ChromeCast{name: null, title: null, model: null, address: metadataType, port: 8009}");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        boolean boolean3 = chromeCast2.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.play();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        boolean boolean3 = chromeCast2.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.setVolumeByIncrement((float) 100L);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        boolean boolean3 = chromeCast2.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.Application application5 = chromeCast2.launchApp("locationName");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        int int3 = chromeCast2.getPort();
        java.lang.String str4 = chromeCast2.getAddress();
        chromeCast2.setName("episodeNumber");
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.Application application7 = chromeCast2.getRunningApp();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.seek((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        chromeCast2.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.setVolume((float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        su.litvak.chromecast.api.v2.Media media3 = null;
        su.litvak.chromecast.api.v2.Item item4 = new su.litvak.chromecast.api.v2.Item(false, strMap1, (long) (short) 0, media3);
        su.litvak.chromecast.api.v2.Media media5 = item4.media;
        java.lang.String str6 = item4.toString();
        org.junit.Assert.assertNull(media5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item{id: 0, media: null}" + "'", str6, "Item{id: 0, media: null}");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        su.litvak.chromecast.api.v2.Namespace namespace1 = new su.litvak.chromecast.api.v2.Namespace("locationName");
        java.lang.String str2 = namespace1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Namespace{locationName}" + "'", str2, "Namespace{locationName}");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        chromeCast2.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.connect();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        chromeCast2.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.pause();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        boolean boolean3 = chromeCast2.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.Application application5 = chromeCast2.launchApp("releaseDate");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        java.lang.String str0 = su.litvak.chromecast.api.v2.Media.METADATA_DISC_NUMBER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "discNumber" + "'", str0, "discNumber");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.seek(100.0d);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent.SpontaneousEventType spontaneousEventType0 = su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent.SpontaneousEventType.STATUS;
        su.litvak.chromecast.api.v2.MediaStatus.PlayerState playerState1 = su.litvak.chromecast.api.v2.MediaStatus.PlayerState.BUFFERING;
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent chromeCastSpontaneousEvent2 = new su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent(spontaneousEventType0, (java.lang.Object) playerState1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data type class su.litvak.chromecast.api.v2.MediaStatus$PlayerState does not match type for event class su.litvak.chromecast.api.v2.Status");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + spontaneousEventType0 + "' != '" + su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent.SpontaneousEventType.STATUS + "'", spontaneousEventType0.equals(su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent.SpontaneousEventType.STATUS));
        org.junit.Assert.assertTrue("'" + playerState1 + "' != '" + su.litvak.chromecast.api.v2.MediaStatus.PlayerState.BUFFERING + "'", playerState1.equals(su.litvak.chromecast.api.v2.MediaStatus.PlayerState.BUFFERING));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.lang.String str0 = su.litvak.chromecast.api.v2.Media.METADATA_ARTIST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "artist" + "'", str0, "artist");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        su.litvak.chromecast.api.v2.Media media2 = new su.litvak.chromecast.api.v2.Media("discNumber", "metadataType");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        su.litvak.chromecast.api.v2.Media.StreamType streamType3 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media4 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = media4.textTrackStyle;
        java.lang.String str6 = media4.url;
        org.junit.Assert.assertTrue("'" + streamType3 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType3.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Namespace{}" + "'", str6, "Namespace{}");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        java.lang.String str9 = chromeCast2.getTitle();
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.MediaStatus mediaStatus14 = chromeCast2.load("locationName", "images", "artist", "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        su.litvak.chromecast.api.v2.Media.MetadataType metadataType0 = su.litvak.chromecast.api.v2.Media.MetadataType.TV_SHOW;
        org.junit.Assert.assertTrue("'" + metadataType0 + "' != '" + su.litvak.chromecast.api.v2.Media.MetadataType.TV_SHOW + "'", metadataType0.equals(su.litvak.chromecast.api.v2.Media.MetadataType.TV_SHOW));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        su.litvak.chromecast.api.v2.Media.StreamType streamType0 = su.litvak.chromecast.api.v2.Media.StreamType.BUFFERED;
        org.junit.Assert.assertTrue("'" + streamType0 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.BUFFERED + "'", streamType0.equals(su.litvak.chromecast.api.v2.Media.StreamType.BUFFERED));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        su.litvak.chromecast.api.v2.MediaStatus.IdleReason idleReason0 = su.litvak.chromecast.api.v2.MediaStatus.IdleReason.FINISHED;
        org.junit.Assert.assertTrue("'" + idleReason0 + "' != '" + su.litvak.chromecast.api.v2.MediaStatus.IdleReason.FINISHED + "'", idleReason0.equals(su.litvak.chromecast.api.v2.MediaStatus.IdleReason.FINISHED));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        java.lang.String str3 = chromeCast2.getName();
        java.lang.String str4 = chromeCast2.getAppsURL();
        chromeCast2.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.setMuted(false);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent.SpontaneousEventType spontaneousEventType0 = su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent.SpontaneousEventType.CLOSE;
        java.lang.Class<?> wildcardClass1 = spontaneousEventType0.getDataClass();
        org.junit.Assert.assertTrue("'" + spontaneousEventType0 + "' != '" + su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent.SpontaneousEventType.CLOSE + "'", spontaneousEventType0.equals(su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent.SpontaneousEventType.CLOSE));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        boolean boolean3 = chromeCast2.isConnected();
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener4 = null;
        chromeCast2.unregisterListener(chromeCastSpontaneousEventListener4);
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.setMuted(false);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        su.litvak.chromecast.api.v2.Track.TrackType trackType1 = null;
        su.litvak.chromecast.api.v2.Track track2 = new su.litvak.chromecast.api.v2.Track(1L, trackType1);
        java.lang.String str3 = track2.toString();
        long long4 = track2.id;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Track{id: 1, type: null}" + "'", str3, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        int int3 = chromeCast2.getPort();
        java.lang.String str4 = chromeCast2.getAddress();
        chromeCast2.setName("episodeNumber");
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener7 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = chromeCast2.isAppRunning("discNumber");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        int int3 = chromeCast2.getPort();
        java.lang.String str4 = chromeCast2.getAddress();
        chromeCast2.setName("episodeNumber");
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener7 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = chromeCast2.isAppAvailable("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast1 = new su.litvak.chromecast.api.v2.ChromeCast("metadataType");
        int int2 = chromeCast1.getPort();
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.MediaStatus mediaStatus4 = chromeCast1.load("ChromeCast{name: null, title: null, model: null, address: metadataType, port: 8009}");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8009 + "'", int2 == 8009);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        su.litvak.chromecast.api.v2.MediaStatus.PlayerState playerState0 = su.litvak.chromecast.api.v2.MediaStatus.PlayerState.PAUSED;
        org.junit.Assert.assertTrue("'" + playerState0 + "' != '" + su.litvak.chromecast.api.v2.MediaStatus.PlayerState.PAUSED + "'", playerState0.equals(su.litvak.chromecast.api.v2.MediaStatus.PlayerState.PAUSED));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        su.litvak.chromecast.api.v2.Track.TrackType trackType1 = null;
        su.litvak.chromecast.api.v2.Track track2 = new su.litvak.chromecast.api.v2.Track(1L, trackType1);
        su.litvak.chromecast.api.v2.Track.TrackType trackType3 = track2.type;
        java.lang.String str4 = track2.toString();
        long long5 = track2.id;
        org.junit.Assert.assertNull(trackType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Track{id: 1, type: null}" + "'", str4, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setName("subtitle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        int int3 = chromeCast2.getPort();
        java.lang.String str4 = chromeCast2.getAddress();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.play();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        chromeCast2.disconnect();
        boolean boolean10 = chromeCast2.isAutoReconnect();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.setMuted(true);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.lang.String str0 = su.litvak.chromecast.api.v2.Media.METADATA_ALBUM_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "albumName" + "'", str0, "albumName");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        su.litvak.chromecast.api.v2.MediaStatus.IdleReason idleReason0 = su.litvak.chromecast.api.v2.MediaStatus.IdleReason.ERROR;
        org.junit.Assert.assertTrue("'" + idleReason0 + "' != '" + su.litvak.chromecast.api.v2.MediaStatus.IdleReason.ERROR + "'", idleReason0.equals(su.litvak.chromecast.api.v2.MediaStatus.IdleReason.ERROR));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        chromeCast2.disconnect();
        boolean boolean10 = chromeCast2.isAutoReconnect();
        boolean boolean11 = chromeCast2.isAutoReconnect();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        java.lang.String str3 = chromeCast2.getName();
        java.lang.String str4 = chromeCast2.getAppsURL();
        su.litvak.chromecast.api.v2.Request request6 = null;
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.send("releaseDate", request6);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        su.litvak.chromecast.api.v2.Media.StreamType streamType3 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media4 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType3);
        java.lang.String str5 = media4.url;
        java.lang.String str6 = media4.url;
        org.junit.Assert.assertTrue("'" + streamType3 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType3.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Namespace{}" + "'", str5, "Namespace{}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Namespace{}" + "'", str6, "Namespace{}");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.getAddress();
        java.lang.String str6 = chromeCast2.getName();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.setVolumeByIncrement((float) 100L);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        java.lang.String str0 = su.litvak.chromecast.api.v2.Media.METADATA_TRACK_NUMBER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "trackNumber" + "'", str0, "trackNumber");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.connect();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        java.lang.String str0 = su.litvak.chromecast.api.v2.Media.METADATA_TITLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "title" + "'", str0, "title");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        chromeCast2.disconnect();
        chromeCast2.setAppsURL("hi!");
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.MediaStatus mediaStatus12 = chromeCast2.getMediaStatus();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        su.litvak.chromecast.api.v2.MediaStatus.PlayerState playerState0 = su.litvak.chromecast.api.v2.MediaStatus.PlayerState.IDLE;
        org.junit.Assert.assertTrue("'" + playerState0 + "' != '" + su.litvak.chromecast.api.v2.MediaStatus.PlayerState.IDLE + "'", playerState0.equals(su.litvak.chromecast.api.v2.MediaStatus.PlayerState.IDLE));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        java.lang.String str3 = chromeCast2.getName();
        java.lang.String str4 = chromeCast2.getAppsURL();
        chromeCast2.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.stopApp();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        su.litvak.chromecast.api.v2.Media media2 = new su.litvak.chromecast.api.v2.Media("episodeNumber", "Volume{level: -1.0, muted: false, increment: 0.05, stepInterval: 0.05000000074505806, controlType: attenuation}");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        chromeCast2.disconnect();
        chromeCast2.setAppsURL("hi!");
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.play();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        su.litvak.chromecast.api.v2.Volume volume5 = new su.litvak.chromecast.api.v2.Volume((java.lang.Float) 0.0f, false, (java.lang.Float) 100.0f, (java.lang.Double) 0.05000000074505806d, "");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        java.lang.String str3 = chromeCast2.getName();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.setVolume((float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        chromeCast2.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.connect();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException1 = new su.litvak.chromecast.api.v2.ChromeCastException("width");
        java.lang.Throwable[] throwableArray2 = chromeCastException1.getSuppressed();
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException4 = new su.litvak.chromecast.api.v2.ChromeCastException("locationLatitude");
        chromeCastException1.addSuppressed((java.lang.Throwable) chromeCastException4);
        java.lang.String str6 = chromeCastException4.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "su.litvak.chromecast.api.v2.ChromeCastException: locationLatitude" + "'", str6, "su.litvak.chromecast.api.v2.ChromeCastException: locationLatitude");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException1 = new su.litvak.chromecast.api.v2.ChromeCastException("subtitle");
        java.lang.String str2 = chromeCastException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "su.litvak.chromecast.api.v2.ChromeCastException: subtitle" + "'", str2, "su.litvak.chromecast.api.v2.ChromeCastException: subtitle");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        java.lang.String str9 = chromeCast2.getTitle();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.stopApp();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        java.lang.String str8 = chromeCast2.getAddress();
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener9 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener9);
        chromeCast2.setAppsURL("albumArtist");
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener13 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener13);
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.connect();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException1 = new su.litvak.chromecast.api.v2.ChromeCastException("images");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        java.lang.String str0 = su.litvak.chromecast.api.v2.Media.METADATA_SERIES_TITLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "seriesTitle" + "'", str0, "seriesTitle");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        int int3 = chromeCast2.getPort();
        java.lang.String str4 = chromeCast2.getAddress();
        su.litvak.chromecast.api.v2.Media.StreamType streamType8 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media9 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType8);
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.MediaStatus mediaStatus10 = chromeCast2.load(media9);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + streamType8 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType8.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        java.lang.String str8 = chromeCast2.getAddress();
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener9 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener9);
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener11 = null;
        chromeCast2.unregisterConnectionListener(chromeCastConnectionEventListener11);
        java.lang.String str13 = chromeCast2.getAppTitle();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = chromeCast2.isAppRunning("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        java.lang.String str8 = chromeCast2.getAddress();
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener9 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener9);
        chromeCast2.setAppsURL("albumArtist");
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.MediaStatus mediaStatus17 = chromeCast2.load("broadcastDate", "width", "studio", "artist");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        su.litvak.chromecast.api.v2.Media.StreamType streamType3 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media4 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType3);
        su.litvak.chromecast.api.v2.Media.StreamType streamType8 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media9 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType8);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = media9.textTrackStyle;
        boolean boolean11 = media4.equals((java.lang.Object) media9);
        su.litvak.chromecast.api.v2.Media.StreamType streamType12 = media4.streamType;
        su.litvak.chromecast.api.v2.Media.MetadataType metadataType13 = media4.getMetadataType();
        org.junit.Assert.assertTrue("'" + streamType3 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType3.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertTrue("'" + streamType8 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType8.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + streamType12 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType12.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertTrue("'" + metadataType13 + "' != '" + su.litvak.chromecast.api.v2.Media.MetadataType.GENERIC + "'", metadataType13.equals(su.litvak.chromecast.api.v2.Media.MetadataType.GENERIC));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        chromeCast2.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.stopApp();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        java.lang.String str8 = chromeCast2.getAddress();
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener9 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener9);
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.stopApp();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.getAddress();
        java.lang.String str6 = chromeCast2.getName();
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.Application application8 = chromeCast2.launchApp("Volume{level: -1.0, muted: false, increment: 0.05, stepInterval: 0.05000000074505806, controlType: attenuation}");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast1 = new su.litvak.chromecast.api.v2.ChromeCast("hi!");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException1 = new su.litvak.chromecast.api.v2.ChromeCastException("");
        java.lang.Throwable[] throwableArray2 = chromeCastException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = chromeCastException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = chromeCastException1.getSuppressed();
        java.lang.String str5 = chromeCastException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "su.litvak.chromecast.api.v2.ChromeCastException: " + "'", str5, "su.litvak.chromecast.api.v2.ChromeCastException: ");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        su.litvak.chromecast.api.v2.Namespace namespace1 = new su.litvak.chromecast.api.v2.Namespace("discNumber");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        su.litvak.chromecast.api.v2.Media.StreamType streamType3 = su.litvak.chromecast.api.v2.Media.StreamType.LIVE;
        su.litvak.chromecast.api.v2.Media media4 = new su.litvak.chromecast.api.v2.Media("", "width", (java.lang.Double) (-1.0d), streamType3);
        java.lang.String str5 = media4.toString();
        org.junit.Assert.assertTrue("'" + streamType3 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.LIVE + "'", streamType3.equals(su.litvak.chromecast.api.v2.Media.StreamType.LIVE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Media{url: , contentType: width, duration: -1.0}" + "'", str5, "Media{url: , contentType: width, duration: -1.0}");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.getAddress();
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.MediaStatus mediaStatus6 = chromeCast2.getMediaStatus();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        su.litvak.chromecast.api.v2.Media.StreamType streamType3 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media4 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType3);
        su.litvak.chromecast.api.v2.Media.StreamType streamType8 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media9 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType8);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = media9.textTrackStyle;
        boolean boolean11 = media4.equals((java.lang.Object) media9);
        su.litvak.chromecast.api.v2.Media.StreamType streamType12 = media4.streamType;
        su.litvak.chromecast.api.v2.Media.StreamType streamType13 = media4.streamType;
        org.junit.Assert.assertTrue("'" + streamType3 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType3.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertTrue("'" + streamType8 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType8.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + streamType12 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType12.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertTrue("'" + streamType13 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType13.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("episodeNumber", (int) (short) 0);
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener3 = null;
        chromeCast2.registerListener(chromeCastSpontaneousEventListener3);
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.MediaStatus mediaStatus6 = chromeCast2.load("locationLatitude");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        java.lang.String str0 = su.litvak.chromecast.api.v2.Media.METADATA_SEASON_NUMBER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "seasonNumber" + "'", str0, "seasonNumber");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        chromeCast2.disconnect();
        boolean boolean10 = chromeCast2.isAutoReconnect();
        chromeCast2.setAutoReconnect(false);
        java.lang.String str13 = chromeCast2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str13, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        java.lang.String str9 = chromeCast2.getTitle();
        java.lang.Class<?> wildcardClass10 = chromeCast2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        java.lang.String str8 = chromeCast2.getAddress();
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener9 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener9);
        chromeCast2.setAppsURL("albumArtist");
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener13 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener13);
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.Application application16 = chromeCast2.launchApp("Media{url: , contentType: width, duration: -1.0}");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        java.lang.String str8 = chromeCast2.getAddress();
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener9 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener9);
        boolean boolean11 = chromeCast2.isAutoReconnect();
        int int12 = chromeCast2.getPort();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        java.lang.String str3 = chromeCast2.getName();
        su.litvak.chromecast.api.v2.Request request5 = null;
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.send("hi!", request5);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        su.litvak.chromecast.api.v2.Namespace namespace1 = new su.litvak.chromecast.api.v2.Namespace("");
        java.lang.Class<?> wildcardClass2 = namespace1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        java.lang.String str8 = chromeCast2.getAddress();
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener9 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener9);
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener11 = null;
        chromeCast2.unregisterConnectionListener(chromeCastConnectionEventListener11);
        su.litvak.chromecast.api.v2.Request request14 = null;
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.send("artist", request14);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        java.lang.String str8 = chromeCast2.getAddress();
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener9 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener9);
        su.litvak.chromecast.api.v2.Request request12 = null;
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.send("discNumber", request12);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        java.lang.String str8 = chromeCast2.getAddress();
        su.litvak.chromecast.api.v2.Media.StreamType streamType12 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media13 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType12);
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.MediaStatus mediaStatus14 = chromeCast2.load(media13);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + streamType12 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType12.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.Application application6 = chromeCast2.launchApp("composer");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        su.litvak.chromecast.api.v2.ChromeCasts.restartDiscovery();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        int int3 = chromeCast2.getPort();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = chromeCast2.isAppAvailable("metadataType");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        su.litvak.chromecast.api.v2.Media media2 = new su.litvak.chromecast.api.v2.Media("trackNumber", "discNumber");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent.SpontaneousEventType spontaneousEventType0 = su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent.SpontaneousEventType.UNKNOWN;
        su.litvak.chromecast.api.v2.Media.StreamType streamType4 = su.litvak.chromecast.api.v2.Media.StreamType.buffered;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        su.litvak.chromecast.api.v2.Track.TrackType trackType9 = null;
        su.litvak.chromecast.api.v2.Track track10 = new su.litvak.chromecast.api.v2.Track(1L, trackType9);
        java.lang.String str11 = track10.toString();
        long long12 = track10.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType14 = null;
        su.litvak.chromecast.api.v2.Track track15 = new su.litvak.chromecast.api.v2.Track(1L, trackType14);
        su.litvak.chromecast.api.v2.Track.TrackType trackType17 = null;
        su.litvak.chromecast.api.v2.Track track18 = new su.litvak.chromecast.api.v2.Track(1L, trackType17);
        java.lang.String str19 = track18.toString();
        long long20 = track18.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType22 = null;
        su.litvak.chromecast.api.v2.Track track23 = new su.litvak.chromecast.api.v2.Track(1L, trackType22);
        java.lang.String str24 = track23.toString();
        long long25 = track23.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType27 = null;
        su.litvak.chromecast.api.v2.Track track28 = new su.litvak.chromecast.api.v2.Track(1L, trackType27);
        long long29 = track28.id;
        su.litvak.chromecast.api.v2.Track[] trackArray30 = new su.litvak.chromecast.api.v2.Track[] { track10, track15, track18, track23, track28 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Track> trackList31 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Track>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Track>) trackList31, trackArray30);
        su.litvak.chromecast.api.v2.Media media33 = new su.litvak.chromecast.api.v2.Media("locationLongitude", "Namespace{locationName}", (java.lang.Double) 1.0d, streamType4, strMap5, strMap6, strMap7, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList31);
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent chromeCastSpontaneousEvent34 = new su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent(spontaneousEventType0, (java.lang.Object) "Namespace{locationName}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data type class java.lang.String does not match type for event class org.codehaus.jackson.JsonNode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + spontaneousEventType0 + "' != '" + su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent.SpontaneousEventType.UNKNOWN + "'", spontaneousEventType0.equals(su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent.SpontaneousEventType.UNKNOWN));
        org.junit.Assert.assertTrue("'" + streamType4 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.buffered + "'", streamType4.equals(su.litvak.chromecast.api.v2.Media.StreamType.buffered));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Track{id: 1, type: null}" + "'", str11, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Track{id: 1, type: null}" + "'", str19, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Track{id: 1, type: null}" + "'", str24, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertNotNull(trackArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        su.litvak.chromecast.api.v2.Media media2 = new su.litvak.chromecast.api.v2.Media("ChromeCast{name: null, title: null, model: null, address: , port: 10}", "Track{id: 1, type: null}");
        java.lang.String str3 = media2.url;
        su.litvak.chromecast.api.v2.Namespace namespace5 = new su.litvak.chromecast.api.v2.Namespace("");
        java.lang.String str6 = namespace5.toString();
        boolean boolean7 = media2.equals((java.lang.Object) str6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str3, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Namespace{}" + "'", str6, "Namespace{}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        boolean boolean3 = chromeCast2.isConnected();
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener4 = null;
        chromeCast2.unregisterListener(chromeCastSpontaneousEventListener4);
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener6 = null;
        chromeCast2.registerListener(chromeCastSpontaneousEventListener6);
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener8 = null;
        chromeCast2.unregisterListener(chromeCastSpontaneousEventListener8);
        chromeCast2.setAutoReconnect(false);
        su.litvak.chromecast.api.v2.Request request13 = null;
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.send("subtitle", request13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        java.lang.String str8 = chromeCast2.getAddress();
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener9 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener9);
        boolean boolean11 = chromeCast2.isAutoReconnect();
        su.litvak.chromecast.api.v2.Request request13 = null;
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.send("Item{id: 0, media: null}", request13);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        java.lang.String str3 = chromeCast2.toString();
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener4 = null;
        chromeCast2.registerListener(chromeCastSpontaneousEventListener4);
        chromeCast2.setAutoReconnect(true);
        boolean boolean8 = chromeCast2.isAutoReconnect();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str3, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        chromeCast2.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = chromeCast2.isAppRunning("_googlecast._tcp.local.");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        java.lang.String str3 = chromeCast2.toString();
        boolean boolean4 = chromeCast2.isConnected();
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener5 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str3, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        java.lang.String str9 = chromeCast2.getTitle();
        su.litvak.chromecast.api.v2.Media.StreamType streamType13 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media14 = new su.litvak.chromecast.api.v2.Media("", "Namespace{locationName}", (java.lang.Double) 0.0d, streamType13);
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.MediaStatus mediaStatus15 = chromeCast2.load(media14);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + streamType13 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType13.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        java.lang.String str9 = chromeCast2.getTitle();
        chromeCast2.setAutoReconnect(true);
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener12 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("Track{id: 1, type: null}", (int) (short) -1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        su.litvak.chromecast.api.v2.Media media3 = null;
        su.litvak.chromecast.api.v2.Item item4 = new su.litvak.chromecast.api.v2.Item(false, strMap1, (long) (byte) 10, media3);
        su.litvak.chromecast.api.v2.Media media5 = item4.media;
        boolean boolean6 = item4.autoplay;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = item4.customData;
        org.junit.Assert.assertNull(media5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        boolean boolean3 = chromeCast2.isConnected();
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener4 = null;
        chromeCast2.unregisterListener(chromeCastSpontaneousEventListener4);
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener6 = null;
        chromeCast2.registerListener(chromeCastSpontaneousEventListener6);
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener8 = null;
        chromeCast2.unregisterListener(chromeCastSpontaneousEventListener8);
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.MediaStatus mediaStatus10 = chromeCast2.getMediaStatus();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        su.litvak.chromecast.api.v2.Media.StreamType streamType6 = su.litvak.chromecast.api.v2.Media.StreamType.buffered;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        su.litvak.chromecast.api.v2.Track.TrackType trackType11 = null;
        su.litvak.chromecast.api.v2.Track track12 = new su.litvak.chromecast.api.v2.Track(1L, trackType11);
        java.lang.String str13 = track12.toString();
        long long14 = track12.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType16 = null;
        su.litvak.chromecast.api.v2.Track track17 = new su.litvak.chromecast.api.v2.Track(1L, trackType16);
        su.litvak.chromecast.api.v2.Track.TrackType trackType19 = null;
        su.litvak.chromecast.api.v2.Track track20 = new su.litvak.chromecast.api.v2.Track(1L, trackType19);
        java.lang.String str21 = track20.toString();
        long long22 = track20.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType24 = null;
        su.litvak.chromecast.api.v2.Track track25 = new su.litvak.chromecast.api.v2.Track(1L, trackType24);
        java.lang.String str26 = track25.toString();
        long long27 = track25.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType29 = null;
        su.litvak.chromecast.api.v2.Track track30 = new su.litvak.chromecast.api.v2.Track(1L, trackType29);
        long long31 = track30.id;
        su.litvak.chromecast.api.v2.Track[] trackArray32 = new su.litvak.chromecast.api.v2.Track[] { track12, track17, track20, track25, track30 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Track> trackList33 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Track>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Track>) trackList33, trackArray32);
        su.litvak.chromecast.api.v2.Media media35 = new su.litvak.chromecast.api.v2.Media("locationLongitude", "Namespace{locationName}", (java.lang.Double) 1.0d, streamType6, strMap7, strMap8, strMap9, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList33);
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = null;
        su.litvak.chromecast.api.v2.Track.TrackType trackType40 = null;
        su.litvak.chromecast.api.v2.Track track41 = new su.litvak.chromecast.api.v2.Track(1L, trackType40);
        su.litvak.chromecast.api.v2.Track.TrackType trackType43 = null;
        su.litvak.chromecast.api.v2.Track track44 = new su.litvak.chromecast.api.v2.Track(1L, trackType43);
        java.lang.String str45 = track44.toString();
        long long46 = track44.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType48 = null;
        su.litvak.chromecast.api.v2.Track track49 = new su.litvak.chromecast.api.v2.Track(1L, trackType48);
        su.litvak.chromecast.api.v2.Track.TrackType trackType50 = track49.type;
        su.litvak.chromecast.api.v2.Track.TrackType trackType52 = null;
        su.litvak.chromecast.api.v2.Track track53 = new su.litvak.chromecast.api.v2.Track(1L, trackType52);
        su.litvak.chromecast.api.v2.Track[] trackArray54 = new su.litvak.chromecast.api.v2.Track[] { track41, track44, track49, track53 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Track> trackList55 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Track>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Track>) trackList55, trackArray54);
        su.litvak.chromecast.api.v2.Media media57 = new su.litvak.chromecast.api.v2.Media("Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}", "albumArtist", (java.lang.Double) 100.0d, streamType6, strMap36, strMap37, strMap38, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList55);
        java.lang.String str58 = media57.toString();
        org.junit.Assert.assertTrue("'" + streamType6 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.buffered + "'", streamType6.equals(su.litvak.chromecast.api.v2.Media.StreamType.buffered));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Track{id: 1, type: null}" + "'", str13, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Track{id: 1, type: null}" + "'", str21, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Track{id: 1, type: null}" + "'", str26, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertNotNull(trackArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Track{id: 1, type: null}" + "'", str45, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertNull(trackType50);
        org.junit.Assert.assertNotNull(trackArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Media{url: Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}, contentType: albumArtist, duration: 100.0}" + "'", str58, "Media{url: Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}, contentType: albumArtist, duration: 100.0}");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        su.litvak.chromecast.api.v2.Media media3 = null;
        su.litvak.chromecast.api.v2.Item item4 = new su.litvak.chromecast.api.v2.Item(false, strMap1, (long) (short) 0, media3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = item4.customData;
        java.lang.String str6 = item4.toString();
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item{id: 0, media: null}" + "'", str6, "Item{id: 0, media: null}");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        su.litvak.chromecast.api.v2.Media.StreamType streamType3 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media4 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = media4.textTrackStyle;
        java.lang.String str6 = media4.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = media4.textTrackStyle;
        org.junit.Assert.assertTrue("'" + streamType3 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType3.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}" + "'", str6, "Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}");
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        su.litvak.chromecast.api.v2.Media media2 = new su.litvak.chromecast.api.v2.Media("ChromeCast{name: null, title: null, model: null, address: , port: 10}", "Track{id: 1, type: null}");
        java.lang.String str3 = media2.url;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = media2.metadata;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = media2.textTrackStyle;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str3, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast1 = new su.litvak.chromecast.api.v2.ChromeCast("metadataType");
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener2 = null;
        chromeCast1.registerListener(chromeCastSpontaneousEventListener2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException1 = new su.litvak.chromecast.api.v2.ChromeCastException("ChromeCast{name: null, title: null, model: null, address: metadataType, port: 8009}");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        chromeCast2.setName("su.litvak.chromecast.api.v2.ChromeCastException: ");
        boolean boolean11 = chromeCast2.isAutoReconnect();
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.Application application13 = chromeCast2.launchApp("subtitle");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        java.lang.String str9 = chromeCast2.getTitle();
        chromeCast2.setApplication("_googlecast._tcp.local.");
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.stopApp();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        su.litvak.chromecast.api.v2.Media media3 = null;
        su.litvak.chromecast.api.v2.Item item4 = new su.litvak.chromecast.api.v2.Item(false, strMap1, (long) (byte) 10, media3);
        su.litvak.chromecast.api.v2.Media media5 = item4.media;
        boolean boolean6 = item4.autoplay;
        boolean boolean7 = item4.autoplay;
        org.junit.Assert.assertNull(media5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast1 = new su.litvak.chromecast.api.v2.ChromeCast("su.litvak.chromecast.api.v2.ChromeCastException: ");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        java.lang.String str9 = chromeCast2.getTitle();
        boolean boolean10 = chromeCast2.isAutoReconnect();
        chromeCast2.setAppsURL("seasonNumber");
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.MediaStatus mediaStatus13 = chromeCast2.getMediaStatus();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.getAddress();
        java.lang.String str6 = chromeCast2.getName();
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.Application application8 = chromeCast2.launchApp("locationLatitude");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.getAddress();
        java.lang.String str6 = chromeCast2.getName();
        chromeCast2.setAppsURL("Item{id: 0, media: null}");
        java.lang.String str9 = chromeCast2.getAddress();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.getAddress();
        java.lang.String str6 = chromeCast2.getName();
        chromeCast2.setAppsURL("Item{id: 0, media: null}");
        boolean boolean9 = chromeCast2.isAutoReconnect();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        java.lang.String str3 = chromeCast2.getName();
        java.lang.String str4 = chromeCast2.toString();
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.MediaStatus mediaStatus5 = chromeCast2.getMediaStatus();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str4, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        su.litvak.chromecast.api.v2.MediaStatus.IdleReason idleReason0 = su.litvak.chromecast.api.v2.MediaStatus.IdleReason.COMPLETED;
        org.junit.Assert.assertTrue("'" + idleReason0 + "' != '" + su.litvak.chromecast.api.v2.MediaStatus.IdleReason.COMPLETED + "'", idleReason0.equals(su.litvak.chromecast.api.v2.MediaStatus.IdleReason.COMPLETED));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent.SpontaneousEventType spontaneousEventType0 = null;
        su.litvak.chromecast.api.v2.Volume volume1 = new su.litvak.chromecast.api.v2.Volume();
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent chromeCastSpontaneousEvent2 = new su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent(spontaneousEventType0, (java.lang.Object) volume1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        su.litvak.chromecast.api.v2.Media.StreamType streamType3 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media4 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = media4.textTrackStyle;
        java.lang.String str6 = media4.toString();
        java.lang.String str7 = media4.url;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = media4.customData;
        org.junit.Assert.assertTrue("'" + streamType3 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType3.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}" + "'", str6, "Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Namespace{}" + "'", str7, "Namespace{}");
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.disconnect();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        chromeCast2.disconnect();
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener6 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener6);
        java.lang.String str8 = chromeCast2.getName();
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        su.litvak.chromecast.api.v2.Media.StreamType streamType3 = su.litvak.chromecast.api.v2.Media.StreamType.LIVE;
        su.litvak.chromecast.api.v2.Media media4 = new su.litvak.chromecast.api.v2.Media("", "width", (java.lang.Double) (-1.0d), streamType3);
        java.lang.String str5 = media4.url;
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException7 = new su.litvak.chromecast.api.v2.ChromeCastException("width");
        java.lang.Throwable[] throwableArray8 = chromeCastException7.getSuppressed();
        boolean boolean9 = media4.equals((java.lang.Object) chromeCastException7);
        org.junit.Assert.assertTrue("'" + streamType3 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.LIVE + "'", streamType3.equals(su.litvak.chromecast.api.v2.Media.StreamType.LIVE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener8 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener8);
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.play();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException1 = new su.litvak.chromecast.api.v2.ChromeCastException("width");
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            chromeCastException1.addSuppressed(throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        java.lang.String str3 = chromeCast2.getName();
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener4 = null;
        chromeCast2.registerListener(chromeCastSpontaneousEventListener4);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        su.litvak.chromecast.api.v2.Media media2 = new su.litvak.chromecast.api.v2.Media("ChromeCast{name: null, title: null, model: null, address: , port: 10}", "Track{id: 1, type: null}");
        java.lang.String str3 = media2.url;
        su.litvak.chromecast.api.v2.Media.StreamType streamType4 = media2.streamType;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str3, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertNull(streamType4);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        su.litvak.chromecast.api.v2.Media media3 = null;
        su.litvak.chromecast.api.v2.Item item4 = new su.litvak.chromecast.api.v2.Item(false, strMap1, (long) (byte) 10, media3);
        su.litvak.chromecast.api.v2.Media media5 = item4.media;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = item4.customData;
        org.junit.Assert.assertNull(media5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        java.lang.String str3 = chromeCast2.toString();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.setVolume((float) 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str3, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        boolean boolean3 = chromeCast2.isConnected();
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener4 = null;
        chromeCast2.unregisterListener(chromeCastSpontaneousEventListener4);
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.Application application6 = chromeCast2.getRunningApp();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = chromeCast2.isAppAvailable("locationLongitude");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        java.lang.String str9 = chromeCast2.getTitle();
        chromeCast2.setAutoReconnect(true);
        su.litvak.chromecast.api.v2.Request request13 = null;
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.send("", request13);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        int int3 = chromeCast2.getPort();
        java.lang.String str4 = chromeCast2.getAddress();
        chromeCast2.setName("episodeNumber");
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener7 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener7);
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.Status status9 = chromeCast2.getStatus();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException1 = new su.litvak.chromecast.api.v2.ChromeCastException("subtitle");
        java.lang.Throwable[] throwableArray2 = chromeCastException1.getSuppressed();
        java.lang.String str3 = chromeCastException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "su.litvak.chromecast.api.v2.ChromeCastException: subtitle" + "'", str3, "su.litvak.chromecast.api.v2.ChromeCastException: subtitle");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        java.lang.String str8 = chromeCast2.getAddress();
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener9 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener9);
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener11 = null;
        chromeCast2.unregisterConnectionListener(chromeCastConnectionEventListener11);
        java.lang.String str13 = chromeCast2.getAppTitle();
        java.lang.String str14 = chromeCast2.getApplication();
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener15 = null;
        chromeCast2.unregisterListener(chromeCastSpontaneousEventListener15);
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.Application application17 = chromeCast2.getRunningApp();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "creationDate" + "'", str14, "creationDate");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        boolean boolean3 = chromeCast2.isConnected();
        chromeCast2.setAutoReconnect(true);
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.Application application7 = chromeCast2.launchApp("");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        boolean boolean3 = chromeCast2.isConnected();
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener4 = null;
        chromeCast2.unregisterListener(chromeCastSpontaneousEventListener4);
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener6 = null;
        chromeCast2.registerListener(chromeCastSpontaneousEventListener6);
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.setVolumeByIncrement((float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        su.litvak.chromecast.api.v2.Namespace namespace1 = new su.litvak.chromecast.api.v2.Namespace("artist");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        su.litvak.chromecast.api.v2.Media.StreamType streamType9 = su.litvak.chromecast.api.v2.Media.StreamType.buffered;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        su.litvak.chromecast.api.v2.Track.TrackType trackType14 = null;
        su.litvak.chromecast.api.v2.Track track15 = new su.litvak.chromecast.api.v2.Track(1L, trackType14);
        java.lang.String str16 = track15.toString();
        long long17 = track15.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType19 = null;
        su.litvak.chromecast.api.v2.Track track20 = new su.litvak.chromecast.api.v2.Track(1L, trackType19);
        su.litvak.chromecast.api.v2.Track.TrackType trackType22 = null;
        su.litvak.chromecast.api.v2.Track track23 = new su.litvak.chromecast.api.v2.Track(1L, trackType22);
        java.lang.String str24 = track23.toString();
        long long25 = track23.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType27 = null;
        su.litvak.chromecast.api.v2.Track track28 = new su.litvak.chromecast.api.v2.Track(1L, trackType27);
        java.lang.String str29 = track28.toString();
        long long30 = track28.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType32 = null;
        su.litvak.chromecast.api.v2.Track track33 = new su.litvak.chromecast.api.v2.Track(1L, trackType32);
        long long34 = track33.id;
        su.litvak.chromecast.api.v2.Track[] trackArray35 = new su.litvak.chromecast.api.v2.Track[] { track15, track20, track23, track28, track33 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Track> trackList36 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Track>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Track>) trackList36, trackArray35);
        su.litvak.chromecast.api.v2.Media media38 = new su.litvak.chromecast.api.v2.Media("locationLongitude", "Namespace{locationName}", (java.lang.Double) 1.0d, streamType9, strMap10, strMap11, strMap12, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList36);
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap41 = null;
        su.litvak.chromecast.api.v2.Track.TrackType trackType43 = null;
        su.litvak.chromecast.api.v2.Track track44 = new su.litvak.chromecast.api.v2.Track(1L, trackType43);
        su.litvak.chromecast.api.v2.Track.TrackType trackType46 = null;
        su.litvak.chromecast.api.v2.Track track47 = new su.litvak.chromecast.api.v2.Track(1L, trackType46);
        java.lang.String str48 = track47.toString();
        long long49 = track47.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType51 = null;
        su.litvak.chromecast.api.v2.Track track52 = new su.litvak.chromecast.api.v2.Track(1L, trackType51);
        su.litvak.chromecast.api.v2.Track.TrackType trackType53 = track52.type;
        su.litvak.chromecast.api.v2.Track.TrackType trackType55 = null;
        su.litvak.chromecast.api.v2.Track track56 = new su.litvak.chromecast.api.v2.Track(1L, trackType55);
        su.litvak.chromecast.api.v2.Track[] trackArray57 = new su.litvak.chromecast.api.v2.Track[] { track44, track47, track52, track56 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Track> trackList58 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Track>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Track>) trackList58, trackArray57);
        su.litvak.chromecast.api.v2.Media media60 = new su.litvak.chromecast.api.v2.Media("Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}", "albumArtist", (java.lang.Double) 100.0d, streamType9, strMap39, strMap40, strMap41, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList58);
        su.litvak.chromecast.api.v2.Media media61 = new su.litvak.chromecast.api.v2.Media("attenuation", "releaseDate", (java.lang.Double) 0.0d, streamType9);
        java.lang.String str62 = media61.url;
        org.junit.Assert.assertTrue("'" + streamType9 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.buffered + "'", streamType9.equals(su.litvak.chromecast.api.v2.Media.StreamType.buffered));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Track{id: 1, type: null}" + "'", str16, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Track{id: 1, type: null}" + "'", str24, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Track{id: 1, type: null}" + "'", str29, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertNotNull(trackArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Track{id: 1, type: null}" + "'", str48, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertNull(trackType53);
        org.junit.Assert.assertNotNull(trackArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "attenuation" + "'", str62, "attenuation");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        su.litvak.chromecast.api.v2.Media.StreamType streamType3 = su.litvak.chromecast.api.v2.Media.StreamType.LIVE;
        su.litvak.chromecast.api.v2.Media media4 = new su.litvak.chromecast.api.v2.Media("Track{id: 1, type: null}", "su.litvak.chromecast.api.v2.ChromeCastException: locationLatitude", (java.lang.Double) (-1.0d), streamType3);
        org.junit.Assert.assertTrue("'" + streamType3 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.LIVE + "'", streamType3.equals(su.litvak.chromecast.api.v2.Media.StreamType.LIVE));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        chromeCast2.disconnect();
        chromeCast2.setAppsURL("hi!");
        chromeCast2.setApplication("locationName");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        su.litvak.chromecast.api.v2.Media media3 = null;
        su.litvak.chromecast.api.v2.Item item4 = new su.litvak.chromecast.api.v2.Item(false, strMap1, (long) (byte) 10, media3);
        su.litvak.chromecast.api.v2.Media media5 = item4.media;
        java.lang.String str6 = item4.toString();
        org.junit.Assert.assertNull(media5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item{id: 10, media: null}" + "'", str6, "Item{id: 10, media: null}");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.seek((double) 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException1 = new su.litvak.chromecast.api.v2.ChromeCastException("seasonNumber");
        java.lang.String str2 = chromeCastException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "su.litvak.chromecast.api.v2.ChromeCastException: seasonNumber" + "'", str2, "su.litvak.chromecast.api.v2.ChromeCastException: seasonNumber");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        su.litvak.chromecast.api.v2.Namespace namespace8 = new su.litvak.chromecast.api.v2.Namespace("discNumber");
        su.litvak.chromecast.api.v2.Namespace namespace10 = new su.litvak.chromecast.api.v2.Namespace("locationName");
        java.lang.String str11 = namespace10.toString();
        su.litvak.chromecast.api.v2.Namespace namespace13 = new su.litvak.chromecast.api.v2.Namespace("");
        su.litvak.chromecast.api.v2.Namespace namespace15 = new su.litvak.chromecast.api.v2.Namespace("");
        su.litvak.chromecast.api.v2.Namespace[] namespaceArray16 = new su.litvak.chromecast.api.v2.Namespace[] { namespace8, namespace10, namespace13, namespace15 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Namespace> namespaceList17 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Namespace>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Namespace>) namespaceList17, namespaceArray16);
        su.litvak.chromecast.api.v2.Application application19 = new su.litvak.chromecast.api.v2.Application("metadataType", "releaseDate", "su.litvak.chromecast.api.v2.ChromeCastException: subtitle", "title", false, false, "Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}", (java.util.List<su.litvak.chromecast.api.v2.Namespace>) namespaceList17);
        java.lang.String str20 = application19.toString();
        java.lang.String str21 = application19.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Namespace{locationName}" + "'", str11, "Namespace{locationName}");
        org.junit.Assert.assertNotNull(namespaceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Application{id: metadataType, name: releaseDate, sessionId: su.litvak.chromecast.api.v2.ChromeCastException: subtitle, statusText: title, transportId: Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}, isIdleScreen: false, launchedFromCloud: false, namespaces: [Namespace{discNumber}, Namespace{locationName}, Namespace{}, Namespace{}]}" + "'", str20, "Application{id: metadataType, name: releaseDate, sessionId: su.litvak.chromecast.api.v2.ChromeCastException: subtitle, statusText: title, transportId: Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}, isIdleScreen: false, launchedFromCloud: false, namespaces: [Namespace{discNumber}, Namespace{locationName}, Namespace{}, Namespace{}]}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Application{id: metadataType, name: releaseDate, sessionId: su.litvak.chromecast.api.v2.ChromeCastException: subtitle, statusText: title, transportId: Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}, isIdleScreen: false, launchedFromCloud: false, namespaces: [Namespace{discNumber}, Namespace{locationName}, Namespace{}, Namespace{}]}" + "'", str21, "Application{id: metadataType, name: releaseDate, sessionId: su.litvak.chromecast.api.v2.ChromeCastException: subtitle, statusText: title, transportId: Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}, isIdleScreen: false, launchedFromCloud: false, namespaces: [Namespace{discNumber}, Namespace{locationName}, Namespace{}, Namespace{}]}");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        su.litvak.chromecast.api.v2.Media media3 = null;
        su.litvak.chromecast.api.v2.Item item4 = new su.litvak.chromecast.api.v2.Item(false, strMap1, (long) (byte) 10, media3);
        boolean boolean5 = item4.autoplay;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = item4.customData;
        long long7 = item4.id;
        su.litvak.chromecast.api.v2.Media media8 = item4.media;
        java.lang.String str9 = item4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNull(media8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item{id: 10, media: null}" + "'", str9, "Item{id: 10, media: null}");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("_googlecast._tcp.local.", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.setMuted(false);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: _googlecast._tcp.local.");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = chromeCast2.isAppAvailable("su.litvak.chromecast.api.v2.ChromeCastException: locationLatitude");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        su.litvak.chromecast.api.v2.Media media2 = new su.litvak.chromecast.api.v2.Media("width", "images");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        su.litvak.chromecast.api.v2.Media.StreamType streamType3 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media4 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType3);
        su.litvak.chromecast.api.v2.Media.StreamType streamType8 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media9 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType8);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = media9.textTrackStyle;
        boolean boolean11 = media4.equals((java.lang.Object) media9);
        java.lang.String str12 = media4.toString();
        org.junit.Assert.assertTrue("'" + streamType3 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType3.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertTrue("'" + streamType8 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType8.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}" + "'", str12, "Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener8 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener8);
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.MediaStatus mediaStatus14 = chromeCast2.load("subtitle", "subtitle", "episodeNumber", "discNumber");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        boolean boolean3 = chromeCast2.isConnected();
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener4 = null;
        chromeCast2.unregisterListener(chromeCastSpontaneousEventListener4);
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener6 = null;
        chromeCast2.registerListener(chromeCastSpontaneousEventListener6);
        java.lang.String str8 = chromeCast2.getModel();
        su.litvak.chromecast.api.v2.Request request10 = null;
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.send("albumArtist", request10);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        java.lang.String str9 = chromeCast2.getTitle();
        chromeCast2.setApplication("_googlecast._tcp.local.");
        boolean boolean12 = chromeCast2.isAutoReconnect();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.pause();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("_googlecast._tcp.local.", (int) '#');
        java.lang.String str3 = chromeCast2.getAppsURL();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        su.litvak.chromecast.api.v2.Media media3 = null;
        su.litvak.chromecast.api.v2.Item item4 = new su.litvak.chromecast.api.v2.Item(false, strMap1, (long) (short) 0, media3);
        su.litvak.chromecast.api.v2.Media media5 = item4.media;
        su.litvak.chromecast.api.v2.Media media6 = item4.media;
        org.junit.Assert.assertNull(media5);
        org.junit.Assert.assertNull(media6);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        su.litvak.chromecast.api.v2.Media.StreamType streamType3 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media4 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType3);
        su.litvak.chromecast.api.v2.Media.StreamType streamType8 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media9 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType8);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = media9.textTrackStyle;
        boolean boolean11 = media4.equals((java.lang.Object) media9);
        java.lang.String str12 = media9.toString();
        java.lang.String str13 = media9.url;
        org.junit.Assert.assertTrue("'" + streamType3 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType3.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertTrue("'" + streamType8 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType8.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}" + "'", str12, "Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Namespace{}" + "'", str13, "Namespace{}");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        chromeCast2.disconnect();
        java.lang.String str10 = chromeCast2.getApplication();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "creationDate" + "'", str10, "creationDate");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        su.litvak.chromecast.api.v2.Media.StreamType streamType6 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media7 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType6);
        su.litvak.chromecast.api.v2.Media.StreamType streamType11 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media12 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType11);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = media12.textTrackStyle;
        boolean boolean14 = media7.equals((java.lang.Object) media12);
        java.lang.String str15 = media12.toString();
        su.litvak.chromecast.api.v2.Media.StreamType streamType16 = media12.streamType;
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        su.litvak.chromecast.api.v2.Media.StreamType streamType23 = su.litvak.chromecast.api.v2.Media.StreamType.live;
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = null;
        su.litvak.chromecast.api.v2.Track.TrackType trackType28 = null;
        su.litvak.chromecast.api.v2.Track track29 = new su.litvak.chromecast.api.v2.Track(1L, trackType28);
        java.lang.String str30 = track29.toString();
        su.litvak.chromecast.api.v2.Track.TrackType trackType32 = null;
        su.litvak.chromecast.api.v2.Track track33 = new su.litvak.chromecast.api.v2.Track(1L, trackType32);
        su.litvak.chromecast.api.v2.Track.TrackType trackType34 = track33.type;
        java.lang.String str35 = track33.toString();
        su.litvak.chromecast.api.v2.Track[] trackArray36 = new su.litvak.chromecast.api.v2.Track[] { track29, track33 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Track> trackList37 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Track>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Track>) trackList37, trackArray36);
        su.litvak.chromecast.api.v2.Media media39 = new su.litvak.chromecast.api.v2.Media("Application{id: metadataType, name: releaseDate, sessionId: su.litvak.chromecast.api.v2.ChromeCastException: subtitle, statusText: title, transportId: Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}, isIdleScreen: false, launchedFromCloud: false, namespaces: [Namespace{discNumber}, Namespace{locationName}, Namespace{}, Namespace{}]}", "broadcastDate", (java.lang.Double) 100.0d, streamType23, strMap24, strMap25, strMap26, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList37);
        su.litvak.chromecast.api.v2.Media media40 = new su.litvak.chromecast.api.v2.Media("ChromeCast{name: null, title: null, model: null, address: , port: 10}", "studio", (java.lang.Double) 0.0d, streamType16, strMap17, strMap18, strMap19, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList37);
        org.junit.Assert.assertTrue("'" + streamType6 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType6.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertTrue("'" + streamType11 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType11.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}" + "'", str15, "Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}");
        org.junit.Assert.assertTrue("'" + streamType16 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType16.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertTrue("'" + streamType23 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.live + "'", streamType23.equals(su.litvak.chromecast.api.v2.Media.StreamType.live));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Track{id: 1, type: null}" + "'", str30, "Track{id: 1, type: null}");
        org.junit.Assert.assertNull(trackType34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Track{id: 1, type: null}" + "'", str35, "Track{id: 1, type: null}");
        org.junit.Assert.assertNotNull(trackArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        su.litvak.chromecast.api.v2.Media.StreamType streamType3 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media4 = new su.litvak.chromecast.api.v2.Media("locationLongitude", "hi!", (java.lang.Double) 0.0d, streamType3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = media4.textTrackStyle;
        org.junit.Assert.assertTrue("'" + streamType3 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType3.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        su.litvak.chromecast.api.v2.Media media2 = new su.litvak.chromecast.api.v2.Media("ChromeCast{name: null, title: null, model: null, address: , port: 10}", "Track{id: 1, type: null}");
        java.lang.String str3 = media2.contentType;
        java.lang.Double double4 = media2.duration;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Track{id: 1, type: null}" + "'", str3, "Track{id: 1, type: null}");
        org.junit.Assert.assertNull(double4);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        boolean boolean3 = chromeCast2.isConnected();
        chromeCast2.setAutoReconnect(true);
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.MediaStatus mediaStatus7 = chromeCast2.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        su.litvak.chromecast.api.v2.Media media3 = null;
        su.litvak.chromecast.api.v2.Item item4 = new su.litvak.chromecast.api.v2.Item(false, strMap1, (long) 100, media3);
        su.litvak.chromecast.api.v2.Media media5 = item4.media;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = item4.customData;
        org.junit.Assert.assertNull(media5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast1 = new su.litvak.chromecast.api.v2.ChromeCast("subtitle");
        java.lang.String str2 = chromeCast1.getAppTitle();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}", (int) (byte) 1);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        su.litvak.chromecast.api.v2.Media.StreamType streamType3 = su.litvak.chromecast.api.v2.Media.StreamType.live;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        su.litvak.chromecast.api.v2.Media.StreamType streamType13 = su.litvak.chromecast.api.v2.Media.StreamType.buffered;
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        su.litvak.chromecast.api.v2.Track.TrackType trackType18 = null;
        su.litvak.chromecast.api.v2.Track track19 = new su.litvak.chromecast.api.v2.Track(1L, trackType18);
        java.lang.String str20 = track19.toString();
        long long21 = track19.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType23 = null;
        su.litvak.chromecast.api.v2.Track track24 = new su.litvak.chromecast.api.v2.Track(1L, trackType23);
        su.litvak.chromecast.api.v2.Track.TrackType trackType26 = null;
        su.litvak.chromecast.api.v2.Track track27 = new su.litvak.chromecast.api.v2.Track(1L, trackType26);
        java.lang.String str28 = track27.toString();
        long long29 = track27.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType31 = null;
        su.litvak.chromecast.api.v2.Track track32 = new su.litvak.chromecast.api.v2.Track(1L, trackType31);
        java.lang.String str33 = track32.toString();
        long long34 = track32.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType36 = null;
        su.litvak.chromecast.api.v2.Track track37 = new su.litvak.chromecast.api.v2.Track(1L, trackType36);
        long long38 = track37.id;
        su.litvak.chromecast.api.v2.Track[] trackArray39 = new su.litvak.chromecast.api.v2.Track[] { track19, track24, track27, track32, track37 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Track> trackList40 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Track>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Track>) trackList40, trackArray39);
        su.litvak.chromecast.api.v2.Media media42 = new su.litvak.chromecast.api.v2.Media("locationLongitude", "Namespace{locationName}", (java.lang.Double) 1.0d, streamType13, strMap14, strMap15, strMap16, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList40);
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap44 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = null;
        su.litvak.chromecast.api.v2.Track.TrackType trackType47 = null;
        su.litvak.chromecast.api.v2.Track track48 = new su.litvak.chromecast.api.v2.Track(1L, trackType47);
        su.litvak.chromecast.api.v2.Track.TrackType trackType50 = null;
        su.litvak.chromecast.api.v2.Track track51 = new su.litvak.chromecast.api.v2.Track(1L, trackType50);
        java.lang.String str52 = track51.toString();
        long long53 = track51.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType55 = null;
        su.litvak.chromecast.api.v2.Track track56 = new su.litvak.chromecast.api.v2.Track(1L, trackType55);
        su.litvak.chromecast.api.v2.Track.TrackType trackType57 = track56.type;
        su.litvak.chromecast.api.v2.Track.TrackType trackType59 = null;
        su.litvak.chromecast.api.v2.Track track60 = new su.litvak.chromecast.api.v2.Track(1L, trackType59);
        su.litvak.chromecast.api.v2.Track[] trackArray61 = new su.litvak.chromecast.api.v2.Track[] { track48, track51, track56, track60 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Track> trackList62 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Track>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Track>) trackList62, trackArray61);
        su.litvak.chromecast.api.v2.Media media64 = new su.litvak.chromecast.api.v2.Media("Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}", "albumArtist", (java.lang.Double) 100.0d, streamType13, strMap43, strMap44, strMap45, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList62);
        su.litvak.chromecast.api.v2.Media media65 = new su.litvak.chromecast.api.v2.Media("", "albumName", (java.lang.Double) 1.0d, streamType3, strMap4, strMap5, strMap6, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList62);
        org.junit.Assert.assertTrue("'" + streamType3 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.live + "'", streamType3.equals(su.litvak.chromecast.api.v2.Media.StreamType.live));
        org.junit.Assert.assertTrue("'" + streamType13 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.buffered + "'", streamType13.equals(su.litvak.chromecast.api.v2.Media.StreamType.buffered));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Track{id: 1, type: null}" + "'", str20, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Track{id: 1, type: null}" + "'", str28, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Track{id: 1, type: null}" + "'", str33, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertNotNull(trackArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Track{id: 1, type: null}" + "'", str52, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertNull(trackType57);
        org.junit.Assert.assertNotNull(trackArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        java.lang.String str9 = chromeCast2.getTitle();
        su.litvak.chromecast.api.v2.Media.StreamType streamType19 = su.litvak.chromecast.api.v2.Media.StreamType.buffered;
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = null;
        su.litvak.chromecast.api.v2.Track.TrackType trackType24 = null;
        su.litvak.chromecast.api.v2.Track track25 = new su.litvak.chromecast.api.v2.Track(1L, trackType24);
        java.lang.String str26 = track25.toString();
        long long27 = track25.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType29 = null;
        su.litvak.chromecast.api.v2.Track track30 = new su.litvak.chromecast.api.v2.Track(1L, trackType29);
        su.litvak.chromecast.api.v2.Track.TrackType trackType32 = null;
        su.litvak.chromecast.api.v2.Track track33 = new su.litvak.chromecast.api.v2.Track(1L, trackType32);
        java.lang.String str34 = track33.toString();
        long long35 = track33.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType37 = null;
        su.litvak.chromecast.api.v2.Track track38 = new su.litvak.chromecast.api.v2.Track(1L, trackType37);
        java.lang.String str39 = track38.toString();
        long long40 = track38.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType42 = null;
        su.litvak.chromecast.api.v2.Track track43 = new su.litvak.chromecast.api.v2.Track(1L, trackType42);
        long long44 = track43.id;
        su.litvak.chromecast.api.v2.Track[] trackArray45 = new su.litvak.chromecast.api.v2.Track[] { track25, track30, track33, track38, track43 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Track> trackList46 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Track>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Track>) trackList46, trackArray45);
        su.litvak.chromecast.api.v2.Media media48 = new su.litvak.chromecast.api.v2.Media("locationLongitude", "Namespace{locationName}", (java.lang.Double) 1.0d, streamType19, strMap20, strMap21, strMap22, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList46);
        java.util.Map<java.lang.String, java.lang.Object> strMap49 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap50 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap51 = null;
        su.litvak.chromecast.api.v2.Track.TrackType trackType53 = null;
        su.litvak.chromecast.api.v2.Track track54 = new su.litvak.chromecast.api.v2.Track(1L, trackType53);
        su.litvak.chromecast.api.v2.Track.TrackType trackType56 = null;
        su.litvak.chromecast.api.v2.Track track57 = new su.litvak.chromecast.api.v2.Track(1L, trackType56);
        java.lang.String str58 = track57.toString();
        long long59 = track57.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType61 = null;
        su.litvak.chromecast.api.v2.Track track62 = new su.litvak.chromecast.api.v2.Track(1L, trackType61);
        su.litvak.chromecast.api.v2.Track.TrackType trackType63 = track62.type;
        su.litvak.chromecast.api.v2.Track.TrackType trackType65 = null;
        su.litvak.chromecast.api.v2.Track track66 = new su.litvak.chromecast.api.v2.Track(1L, trackType65);
        su.litvak.chromecast.api.v2.Track[] trackArray67 = new su.litvak.chromecast.api.v2.Track[] { track54, track57, track62, track66 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Track> trackList68 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Track>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Track>) trackList68, trackArray67);
        su.litvak.chromecast.api.v2.Media media70 = new su.litvak.chromecast.api.v2.Media("Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}", "albumArtist", (java.lang.Double) 100.0d, streamType19, strMap49, strMap50, strMap51, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList68);
        su.litvak.chromecast.api.v2.Media media71 = new su.litvak.chromecast.api.v2.Media("attenuation", "releaseDate", (java.lang.Double) 0.0d, streamType19);
        su.litvak.chromecast.api.v2.Media.MetadataType metadataType72 = media71.getMetadataType();
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.MediaStatus mediaStatus73 = chromeCast2.load(media71);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + streamType19 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.buffered + "'", streamType19.equals(su.litvak.chromecast.api.v2.Media.StreamType.buffered));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Track{id: 1, type: null}" + "'", str26, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Track{id: 1, type: null}" + "'", str34, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Track{id: 1, type: null}" + "'", str39, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertNotNull(trackArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Track{id: 1, type: null}" + "'", str58, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
        org.junit.Assert.assertNull(trackType63);
        org.junit.Assert.assertNotNull(trackArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + metadataType72 + "' != '" + su.litvak.chromecast.api.v2.Media.MetadataType.GENERIC + "'", metadataType72.equals(su.litvak.chromecast.api.v2.Media.MetadataType.GENERIC));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        su.litvak.chromecast.api.v2.Media media2 = new su.litvak.chromecast.api.v2.Media("ChromeCast{name: null, title: null, model: null, address: , port: 10}", "Track{id: 1, type: null}");
        java.lang.String str3 = media2.url;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = media2.metadata;
        su.litvak.chromecast.api.v2.Media.StreamType streamType5 = media2.streamType;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str3, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(streamType5);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        java.lang.String str3 = chromeCast2.toString();
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener4 = null;
        chromeCast2.registerListener(chromeCastSpontaneousEventListener4);
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.play();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str3, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        boolean boolean3 = chromeCast2.isConnected();
        chromeCast2.setAutoReconnect(true);
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener6 = null;
        chromeCast2.unregisterConnectionListener(chromeCastConnectionEventListener6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        su.litvak.chromecast.api.v2.Namespace namespace15 = new su.litvak.chromecast.api.v2.Namespace("discNumber");
        su.litvak.chromecast.api.v2.Namespace namespace17 = new su.litvak.chromecast.api.v2.Namespace("locationName");
        java.lang.String str18 = namespace17.toString();
        su.litvak.chromecast.api.v2.Namespace namespace20 = new su.litvak.chromecast.api.v2.Namespace("");
        su.litvak.chromecast.api.v2.Namespace namespace22 = new su.litvak.chromecast.api.v2.Namespace("");
        su.litvak.chromecast.api.v2.Namespace[] namespaceArray23 = new su.litvak.chromecast.api.v2.Namespace[] { namespace15, namespace17, namespace20, namespace22 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Namespace> namespaceList24 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Namespace>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Namespace>) namespaceList24, namespaceArray23);
        su.litvak.chromecast.api.v2.Application application26 = new su.litvak.chromecast.api.v2.Application("metadataType", "releaseDate", "su.litvak.chromecast.api.v2.ChromeCastException: subtitle", "title", false, false, "Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}", (java.util.List<su.litvak.chromecast.api.v2.Namespace>) namespaceList24);
        su.litvak.chromecast.api.v2.Application application27 = new su.litvak.chromecast.api.v2.Application("ChromeCast{name: null, title: null, model: null, address: metadataType, port: 8009}", "Namespace{}", "ChromeCast{name: null, title: null, model: null, address: metadataType, port: 8009}", "metadataType", false, false, "hi!", (java.util.List<su.litvak.chromecast.api.v2.Namespace>) namespaceList24);
        java.lang.String str28 = application27.sessionId;
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Namespace{locationName}" + "'", str18, "Namespace{locationName}");
        org.junit.Assert.assertNotNull(namespaceArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: metadataType, port: 8009}" + "'", str28, "ChromeCast{name: null, title: null, model: null, address: metadataType, port: 8009}");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        su.litvak.chromecast.api.v2.Media media2 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "episodeNumber");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        su.litvak.chromecast.api.v2.Media.StreamType streamType3 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media4 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType3);
        su.litvak.chromecast.api.v2.Media.StreamType streamType8 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media9 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType8);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = media9.textTrackStyle;
        boolean boolean11 = media4.equals((java.lang.Object) media9);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = media4.metadata;
        org.junit.Assert.assertTrue("'" + streamType3 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType3.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertTrue("'" + streamType8 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType8.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        java.lang.String str8 = chromeCast2.getAddress();
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener9 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener9);
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener11 = null;
        chromeCast2.unregisterConnectionListener(chromeCastConnectionEventListener11);
        chromeCast2.setApplication("composer");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        su.litvak.chromecast.api.v2.Media media3 = null;
        su.litvak.chromecast.api.v2.Item item4 = new su.litvak.chromecast.api.v2.Item(false, strMap1, (long) 100, media3);
        su.litvak.chromecast.api.v2.Media media5 = item4.media;
        su.litvak.chromecast.api.v2.Media media6 = item4.media;
        org.junit.Assert.assertNull(media5);
        org.junit.Assert.assertNull(media6);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast1 = new su.litvak.chromecast.api.v2.ChromeCast("subtitle");
        chromeCast1.setAutoReconnect(true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        su.litvak.chromecast.api.v2.Media.StreamType streamType9 = su.litvak.chromecast.api.v2.Media.StreamType.buffered;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        su.litvak.chromecast.api.v2.Track.TrackType trackType14 = null;
        su.litvak.chromecast.api.v2.Track track15 = new su.litvak.chromecast.api.v2.Track(1L, trackType14);
        java.lang.String str16 = track15.toString();
        long long17 = track15.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType19 = null;
        su.litvak.chromecast.api.v2.Track track20 = new su.litvak.chromecast.api.v2.Track(1L, trackType19);
        su.litvak.chromecast.api.v2.Track.TrackType trackType22 = null;
        su.litvak.chromecast.api.v2.Track track23 = new su.litvak.chromecast.api.v2.Track(1L, trackType22);
        java.lang.String str24 = track23.toString();
        long long25 = track23.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType27 = null;
        su.litvak.chromecast.api.v2.Track track28 = new su.litvak.chromecast.api.v2.Track(1L, trackType27);
        java.lang.String str29 = track28.toString();
        long long30 = track28.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType32 = null;
        su.litvak.chromecast.api.v2.Track track33 = new su.litvak.chromecast.api.v2.Track(1L, trackType32);
        long long34 = track33.id;
        su.litvak.chromecast.api.v2.Track[] trackArray35 = new su.litvak.chromecast.api.v2.Track[] { track15, track20, track23, track28, track33 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Track> trackList36 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Track>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Track>) trackList36, trackArray35);
        su.litvak.chromecast.api.v2.Media media38 = new su.litvak.chromecast.api.v2.Media("locationLongitude", "Namespace{locationName}", (java.lang.Double) 1.0d, streamType9, strMap10, strMap11, strMap12, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList36);
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap41 = null;
        su.litvak.chromecast.api.v2.Track.TrackType trackType43 = null;
        su.litvak.chromecast.api.v2.Track track44 = new su.litvak.chromecast.api.v2.Track(1L, trackType43);
        su.litvak.chromecast.api.v2.Track.TrackType trackType46 = null;
        su.litvak.chromecast.api.v2.Track track47 = new su.litvak.chromecast.api.v2.Track(1L, trackType46);
        java.lang.String str48 = track47.toString();
        long long49 = track47.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType51 = null;
        su.litvak.chromecast.api.v2.Track track52 = new su.litvak.chromecast.api.v2.Track(1L, trackType51);
        su.litvak.chromecast.api.v2.Track.TrackType trackType53 = track52.type;
        su.litvak.chromecast.api.v2.Track.TrackType trackType55 = null;
        su.litvak.chromecast.api.v2.Track track56 = new su.litvak.chromecast.api.v2.Track(1L, trackType55);
        su.litvak.chromecast.api.v2.Track[] trackArray57 = new su.litvak.chromecast.api.v2.Track[] { track44, track47, track52, track56 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Track> trackList58 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Track>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Track>) trackList58, trackArray57);
        su.litvak.chromecast.api.v2.Media media60 = new su.litvak.chromecast.api.v2.Media("Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}", "albumArtist", (java.lang.Double) 100.0d, streamType9, strMap39, strMap40, strMap41, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList58);
        su.litvak.chromecast.api.v2.Media media61 = new su.litvak.chromecast.api.v2.Media("attenuation", "releaseDate", (java.lang.Double) 0.0d, streamType9);
        su.litvak.chromecast.api.v2.Media.MetadataType metadataType62 = media61.getMetadataType();
        java.util.Map<java.lang.String, java.lang.Object> strMap63 = media61.metadata;
        org.junit.Assert.assertTrue("'" + streamType9 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.buffered + "'", streamType9.equals(su.litvak.chromecast.api.v2.Media.StreamType.buffered));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Track{id: 1, type: null}" + "'", str16, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Track{id: 1, type: null}" + "'", str24, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Track{id: 1, type: null}" + "'", str29, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertNotNull(trackArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Track{id: 1, type: null}" + "'", str48, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertNull(trackType53);
        org.junit.Assert.assertNotNull(trackArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + metadataType62 + "' != '" + su.litvak.chromecast.api.v2.Media.MetadataType.GENERIC + "'", metadataType62.equals(su.litvak.chromecast.api.v2.Media.MetadataType.GENERIC));
        org.junit.Assert.assertNull(strMap63);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        su.litvak.chromecast.api.v2.Media.StreamType streamType3 = su.litvak.chromecast.api.v2.Media.StreamType.NONE;
        su.litvak.chromecast.api.v2.Media media4 = new su.litvak.chromecast.api.v2.Media("discNumber", "", (java.lang.Double) 100.0d, streamType3);
        org.junit.Assert.assertTrue("'" + streamType3 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.NONE + "'", streamType3.equals(su.litvak.chromecast.api.v2.Media.StreamType.NONE));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        su.litvak.chromecast.api.v2.Media.StreamType streamType3 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media4 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType3);
        su.litvak.chromecast.api.v2.Media.StreamType streamType8 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media9 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType8);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = media9.textTrackStyle;
        boolean boolean11 = media4.equals((java.lang.Object) media9);
        java.lang.String str12 = media9.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = media9.metadata;
        java.util.List<su.litvak.chromecast.api.v2.Track> trackList14 = media9.tracks;
        java.lang.String str15 = media9.toString();
        org.junit.Assert.assertTrue("'" + streamType3 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType3.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertTrue("'" + streamType8 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType8.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}" + "'", str12, "Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}");
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(trackList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}" + "'", str15, "Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        boolean boolean3 = chromeCast2.isConnected();
        chromeCast2.setAutoReconnect(true);
        su.litvak.chromecast.api.v2.Media.StreamType streamType9 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media10 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType9);
        su.litvak.chromecast.api.v2.Media.StreamType streamType14 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media15 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType14);
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = media15.textTrackStyle;
        boolean boolean17 = media10.equals((java.lang.Object) media15);
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.MediaStatus mediaStatus18 = chromeCast2.load(media10);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + streamType9 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType9.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertTrue("'" + streamType14 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType14.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        java.lang.String str8 = chromeCast2.getAddress();
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener9 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener9);
        chromeCast2.setAppsURL("albumArtist");
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.setVolumeByIncrement(0.0f);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener8 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener8);
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.setMuted(true);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        chromeCast2.setApplication("Volume{level: -1.0, muted: false, increment: 0.05, stepInterval: 0.05000000074505806, controlType: attenuation}");
        java.lang.String str7 = chromeCast2.getAppTitle();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        java.lang.String str9 = chromeCast2.getTitle();
        chromeCast2.setAutoReconnect(true);
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener12 = null;
        chromeCast2.unregisterConnectionListener(chromeCastConnectionEventListener12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener8 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener8);
        int int10 = chromeCast2.getPort();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.setVolumeByIncrement((float) 100);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("_googlecast._tcp.local.", (int) '#');
        int int3 = chromeCast2.getPort();
        boolean boolean4 = chromeCast2.isAutoReconnect();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        su.litvak.chromecast.api.v2.Namespace namespace8 = new su.litvak.chromecast.api.v2.Namespace("discNumber");
        su.litvak.chromecast.api.v2.Namespace namespace10 = new su.litvak.chromecast.api.v2.Namespace("locationName");
        java.lang.String str11 = namespace10.toString();
        su.litvak.chromecast.api.v2.Namespace namespace13 = new su.litvak.chromecast.api.v2.Namespace("");
        su.litvak.chromecast.api.v2.Namespace namespace15 = new su.litvak.chromecast.api.v2.Namespace("");
        su.litvak.chromecast.api.v2.Namespace[] namespaceArray16 = new su.litvak.chromecast.api.v2.Namespace[] { namespace8, namespace10, namespace13, namespace15 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Namespace> namespaceList17 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Namespace>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Namespace>) namespaceList17, namespaceArray16);
        su.litvak.chromecast.api.v2.Application application19 = new su.litvak.chromecast.api.v2.Application("metadataType", "releaseDate", "su.litvak.chromecast.api.v2.ChromeCastException: subtitle", "title", false, false, "Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}", (java.util.List<su.litvak.chromecast.api.v2.Namespace>) namespaceList17);
        java.lang.String str20 = application19.name;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Namespace{locationName}" + "'", str11, "Namespace{locationName}");
        org.junit.Assert.assertNotNull(namespaceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "releaseDate" + "'", str20, "releaseDate");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        java.lang.String str8 = chromeCast2.getAddress();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = chromeCast2.isAppAvailable("Application{id: metadataType, name: releaseDate, sessionId: su.litvak.chromecast.api.v2.ChromeCastException: subtitle, statusText: title, transportId: Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}, isIdleScreen: false, launchedFromCloud: false, namespaces: [Namespace{discNumber}, Namespace{locationName}, Namespace{}, Namespace{}]}");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        su.litvak.chromecast.api.v2.Media media3 = null;
        su.litvak.chromecast.api.v2.Item item4 = new su.litvak.chromecast.api.v2.Item(false, strMap1, (long) (short) 0, media3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = item4.customData;
        long long6 = item4.id;
        long long7 = item4.id;
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        java.lang.String str8 = chromeCast2.getAddress();
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener9 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener9);
        java.lang.String str11 = chromeCast2.getApplication();
        java.lang.String str12 = chromeCast2.getModel();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "creationDate" + "'", str11, "creationDate");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        su.litvak.chromecast.api.v2.Media media3 = null;
        su.litvak.chromecast.api.v2.Item item4 = new su.litvak.chromecast.api.v2.Item(false, strMap1, (long) (byte) 10, media3);
        su.litvak.chromecast.api.v2.Media media5 = item4.media;
        boolean boolean7 = item4.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNull(media5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        su.litvak.chromecast.api.v2.ChromeCasts.startDiscovery();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        su.litvak.chromecast.api.v2.Namespace namespace1 = new su.litvak.chromecast.api.v2.Namespace("");
        java.lang.String str2 = namespace1.toString();
        java.lang.String str3 = namespace1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Namespace{}" + "'", str2, "Namespace{}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Namespace{}" + "'", str3, "Namespace{}");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        su.litvak.chromecast.api.v2.Media.StreamType streamType3 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media4 = new su.litvak.chromecast.api.v2.Media("", "Namespace{locationName}", (java.lang.Double) 0.0d, streamType3);
        java.util.List<su.litvak.chromecast.api.v2.Track> trackList5 = media4.tracks;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = media4.textTrackStyle;
        org.junit.Assert.assertTrue("'" + streamType3 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType3.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertNull(trackList5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        su.litvak.chromecast.api.v2.Namespace namespace8 = new su.litvak.chromecast.api.v2.Namespace("discNumber");
        su.litvak.chromecast.api.v2.Namespace namespace10 = new su.litvak.chromecast.api.v2.Namespace("locationName");
        java.lang.String str11 = namespace10.toString();
        su.litvak.chromecast.api.v2.Namespace namespace13 = new su.litvak.chromecast.api.v2.Namespace("");
        su.litvak.chromecast.api.v2.Namespace namespace15 = new su.litvak.chromecast.api.v2.Namespace("");
        su.litvak.chromecast.api.v2.Namespace[] namespaceArray16 = new su.litvak.chromecast.api.v2.Namespace[] { namespace8, namespace10, namespace13, namespace15 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Namespace> namespaceList17 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Namespace>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Namespace>) namespaceList17, namespaceArray16);
        su.litvak.chromecast.api.v2.Application application19 = new su.litvak.chromecast.api.v2.Application("metadataType", "releaseDate", "su.litvak.chromecast.api.v2.ChromeCastException: subtitle", "title", false, false, "Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}", (java.util.List<su.litvak.chromecast.api.v2.Namespace>) namespaceList17);
        java.lang.String str20 = application19.toString();
        java.lang.String str21 = application19.statusText;
        java.lang.String str22 = application19.id;
        java.util.List<su.litvak.chromecast.api.v2.Namespace> namespaceList23 = application19.namespaces;
        boolean boolean24 = application19.isIdleScreen;
        java.lang.String str25 = application19.sessionId;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Namespace{locationName}" + "'", str11, "Namespace{locationName}");
        org.junit.Assert.assertNotNull(namespaceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Application{id: metadataType, name: releaseDate, sessionId: su.litvak.chromecast.api.v2.ChromeCastException: subtitle, statusText: title, transportId: Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}, isIdleScreen: false, launchedFromCloud: false, namespaces: [Namespace{discNumber}, Namespace{locationName}, Namespace{}, Namespace{}]}" + "'", str20, "Application{id: metadataType, name: releaseDate, sessionId: su.litvak.chromecast.api.v2.ChromeCastException: subtitle, statusText: title, transportId: Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}, isIdleScreen: false, launchedFromCloud: false, namespaces: [Namespace{discNumber}, Namespace{locationName}, Namespace{}, Namespace{}]}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "title" + "'", str21, "title");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "metadataType" + "'", str22, "metadataType");
        org.junit.Assert.assertNotNull(namespaceList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "su.litvak.chromecast.api.v2.ChromeCastException: subtitle" + "'", str25, "su.litvak.chromecast.api.v2.ChromeCastException: subtitle");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        su.litvak.chromecast.api.v2.Track.TrackType trackType1 = null;
        su.litvak.chromecast.api.v2.Track track2 = new su.litvak.chromecast.api.v2.Track(1L, trackType1);
        java.lang.String str3 = track2.toString();
        java.lang.String str4 = track2.toString();
        su.litvak.chromecast.api.v2.Track.TrackType trackType5 = track2.type;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Track{id: 1, type: null}" + "'", str3, "Track{id: 1, type: null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Track{id: 1, type: null}" + "'", str4, "Track{id: 1, type: null}");
        org.junit.Assert.assertNull(trackType5);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        su.litvak.chromecast.api.v2.Media.StreamType streamType3 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media4 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType3);
        java.lang.String str5 = media4.url;
        su.litvak.chromecast.api.v2.Media.StreamType streamType6 = media4.streamType;
        org.junit.Assert.assertTrue("'" + streamType3 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType3.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Namespace{}" + "'", str5, "Namespace{}");
        org.junit.Assert.assertTrue("'" + streamType6 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType6.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        su.litvak.chromecast.api.v2.Namespace namespace8 = new su.litvak.chromecast.api.v2.Namespace("discNumber");
        su.litvak.chromecast.api.v2.Namespace namespace10 = new su.litvak.chromecast.api.v2.Namespace("locationName");
        java.lang.String str11 = namespace10.toString();
        su.litvak.chromecast.api.v2.Namespace namespace13 = new su.litvak.chromecast.api.v2.Namespace("");
        su.litvak.chromecast.api.v2.Namespace namespace15 = new su.litvak.chromecast.api.v2.Namespace("");
        su.litvak.chromecast.api.v2.Namespace[] namespaceArray16 = new su.litvak.chromecast.api.v2.Namespace[] { namespace8, namespace10, namespace13, namespace15 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Namespace> namespaceList17 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Namespace>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Namespace>) namespaceList17, namespaceArray16);
        su.litvak.chromecast.api.v2.Application application19 = new su.litvak.chromecast.api.v2.Application("metadataType", "releaseDate", "su.litvak.chromecast.api.v2.ChromeCastException: subtitle", "title", false, false, "Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}", (java.util.List<su.litvak.chromecast.api.v2.Namespace>) namespaceList17);
        java.lang.String str20 = application19.toString();
        java.lang.String str21 = application19.name;
        java.lang.String str22 = application19.id;
        java.lang.String str23 = application19.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Namespace{locationName}" + "'", str11, "Namespace{locationName}");
        org.junit.Assert.assertNotNull(namespaceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Application{id: metadataType, name: releaseDate, sessionId: su.litvak.chromecast.api.v2.ChromeCastException: subtitle, statusText: title, transportId: Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}, isIdleScreen: false, launchedFromCloud: false, namespaces: [Namespace{discNumber}, Namespace{locationName}, Namespace{}, Namespace{}]}" + "'", str20, "Application{id: metadataType, name: releaseDate, sessionId: su.litvak.chromecast.api.v2.ChromeCastException: subtitle, statusText: title, transportId: Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}, isIdleScreen: false, launchedFromCloud: false, namespaces: [Namespace{discNumber}, Namespace{locationName}, Namespace{}, Namespace{}]}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "releaseDate" + "'", str21, "releaseDate");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "metadataType" + "'", str22, "metadataType");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Application{id: metadataType, name: releaseDate, sessionId: su.litvak.chromecast.api.v2.ChromeCastException: subtitle, statusText: title, transportId: Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}, isIdleScreen: false, launchedFromCloud: false, namespaces: [Namespace{discNumber}, Namespace{locationName}, Namespace{}, Namespace{}]}" + "'", str23, "Application{id: metadataType, name: releaseDate, sessionId: su.litvak.chromecast.api.v2.ChromeCastException: subtitle, statusText: title, transportId: Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}, isIdleScreen: false, launchedFromCloud: false, namespaces: [Namespace{discNumber}, Namespace{locationName}, Namespace{}, Namespace{}]}");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        chromeCast2.setName("su.litvak.chromecast.api.v2.ChromeCastException: ");
        boolean boolean11 = chromeCast2.isAutoReconnect();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = chromeCast2.isAppRunning("seasonNumber");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        java.lang.String str8 = chromeCast2.getAddress();
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener9 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener9);
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener11 = null;
        chromeCast2.unregisterConnectionListener(chromeCastConnectionEventListener11);
        java.lang.String str13 = chromeCast2.getAppTitle();
        java.lang.String str14 = chromeCast2.getAppsURL();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str14, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException2 = new su.litvak.chromecast.api.v2.ChromeCastException("width");
        java.lang.Throwable[] throwableArray3 = chromeCastException2.getSuppressed();
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException5 = new su.litvak.chromecast.api.v2.ChromeCastException("locationLatitude");
        chromeCastException2.addSuppressed((java.lang.Throwable) chromeCastException5);
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException8 = new su.litvak.chromecast.api.v2.ChromeCastException("subtitle");
        java.lang.Throwable[] throwableArray9 = chromeCastException8.getSuppressed();
        chromeCastException2.addSuppressed((java.lang.Throwable) chromeCastException8);
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException11 = new su.litvak.chromecast.api.v2.ChromeCastException("Media{url: , contentType: width, duration: -1.0}", (java.lang.Throwable) chromeCastException8);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException3 = new su.litvak.chromecast.api.v2.ChromeCastException("");
        java.lang.Throwable[] throwableArray4 = chromeCastException3.getSuppressed();
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException6 = new su.litvak.chromecast.api.v2.ChromeCastException("subtitle");
        chromeCastException3.addSuppressed((java.lang.Throwable) chromeCastException6);
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException8 = new su.litvak.chromecast.api.v2.ChromeCastException("broadcastDate", (java.lang.Throwable) chromeCastException6);
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException9 = new su.litvak.chromecast.api.v2.ChromeCastException("su.litvak.chromecast.api.v2.ChromeCastException: subtitle", (java.lang.Throwable) chromeCastException8);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        java.lang.String str8 = chromeCast2.getAddress();
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener9 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener9);
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener11 = null;
        chromeCast2.unregisterConnectionListener(chromeCastConnectionEventListener11);
        java.lang.String str13 = chromeCast2.getAppTitle();
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.Application application14 = chromeCast2.getRunningApp();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        su.litvak.chromecast.api.v2.Media.StreamType streamType3 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media4 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = media4.metadata;
        su.litvak.chromecast.api.v2.Media.MetadataType metadataType6 = media4.getMetadataType();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = media4.customData;
        org.junit.Assert.assertTrue("'" + streamType3 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType3.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertTrue("'" + metadataType6 + "' != '" + su.litvak.chromecast.api.v2.Media.MetadataType.GENERIC + "'", metadataType6.equals(su.litvak.chromecast.api.v2.Media.MetadataType.GENERIC));
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast1 = new su.litvak.chromecast.api.v2.ChromeCast("subtitle");
        java.lang.String str2 = chromeCast1.getApplication();
        java.lang.String str3 = chromeCast1.getAddress();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "subtitle" + "'", str3, "subtitle");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        java.lang.String str9 = chromeCast2.getTitle();
        boolean boolean10 = chromeCast2.isAutoReconnect();
        java.lang.String str11 = chromeCast2.getModel();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: metadataType, port: 8009}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        java.lang.String str3 = chromeCast2.getName();
        java.lang.String str4 = chromeCast2.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        su.litvak.chromecast.api.v2.Namespace namespace8 = new su.litvak.chromecast.api.v2.Namespace("discNumber");
        su.litvak.chromecast.api.v2.Namespace namespace10 = new su.litvak.chromecast.api.v2.Namespace("locationName");
        java.lang.String str11 = namespace10.toString();
        su.litvak.chromecast.api.v2.Namespace namespace13 = new su.litvak.chromecast.api.v2.Namespace("");
        su.litvak.chromecast.api.v2.Namespace namespace15 = new su.litvak.chromecast.api.v2.Namespace("");
        su.litvak.chromecast.api.v2.Namespace[] namespaceArray16 = new su.litvak.chromecast.api.v2.Namespace[] { namespace8, namespace10, namespace13, namespace15 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Namespace> namespaceList17 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Namespace>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Namespace>) namespaceList17, namespaceArray16);
        su.litvak.chromecast.api.v2.Application application19 = new su.litvak.chromecast.api.v2.Application("metadataType", "releaseDate", "su.litvak.chromecast.api.v2.ChromeCastException: subtitle", "title", false, false, "Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}", (java.util.List<su.litvak.chromecast.api.v2.Namespace>) namespaceList17);
        java.lang.String str20 = application19.toString();
        boolean boolean21 = application19.isIdleScreen;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Namespace{locationName}" + "'", str11, "Namespace{locationName}");
        org.junit.Assert.assertNotNull(namespaceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Application{id: metadataType, name: releaseDate, sessionId: su.litvak.chromecast.api.v2.ChromeCastException: subtitle, statusText: title, transportId: Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}, isIdleScreen: false, launchedFromCloud: false, namespaces: [Namespace{discNumber}, Namespace{locationName}, Namespace{}, Namespace{}]}" + "'", str20, "Application{id: metadataType, name: releaseDate, sessionId: su.litvak.chromecast.api.v2.ChromeCastException: subtitle, statusText: title, transportId: Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}, isIdleScreen: false, launchedFromCloud: false, namespaces: [Namespace{discNumber}, Namespace{locationName}, Namespace{}, Namespace{}]}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        chromeCast2.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.Application application6 = chromeCast2.getRunningApp();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        su.litvak.chromecast.api.v2.Volume volume5 = new su.litvak.chromecast.api.v2.Volume((java.lang.Float) 100.0f, false, (java.lang.Float) 100.0f, (java.lang.Double) 0.0d, "ChromeCast{name: null, title: null, model: null, address: metadataType, port: 8009}");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        java.lang.String str3 = chromeCast2.toString();
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener4 = null;
        chromeCast2.registerListener(chromeCastSpontaneousEventListener4);
        chromeCast2.setAutoReconnect(true);
        chromeCast2.setName("locationName");
        java.lang.String str10 = chromeCast2.getTitle();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.stopApp();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str3, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        su.litvak.chromecast.api.v2.Track.TrackType trackType1 = null;
        su.litvak.chromecast.api.v2.Track track2 = new su.litvak.chromecast.api.v2.Track(1L, trackType1);
        su.litvak.chromecast.api.v2.Track.TrackType trackType3 = track2.type;
        long long4 = track2.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType5 = track2.type;
        org.junit.Assert.assertNull(trackType3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNull(trackType5);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent.SpontaneousEventType spontaneousEventType0 = su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent.SpontaneousEventType.MEDIA_STATUS;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        su.litvak.chromecast.api.v2.Media media4 = null;
        su.litvak.chromecast.api.v2.Item item5 = new su.litvak.chromecast.api.v2.Item(false, strMap2, (long) (byte) 10, media4);
        su.litvak.chromecast.api.v2.Media media6 = item5.media;
        boolean boolean7 = item5.autoplay;
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException9 = new su.litvak.chromecast.api.v2.ChromeCastException("");
        java.lang.Throwable[] throwableArray10 = chromeCastException9.getSuppressed();
        boolean boolean11 = item5.equals((java.lang.Object) throwableArray10);
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent chromeCastSpontaneousEvent12 = new su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent(spontaneousEventType0, (java.lang.Object) item5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data type class su.litvak.chromecast.api.v2.Item does not match type for event class su.litvak.chromecast.api.v2.MediaStatus");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + spontaneousEventType0 + "' != '" + su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent.SpontaneousEventType.MEDIA_STATUS + "'", spontaneousEventType0.equals(su.litvak.chromecast.api.v2.ChromeCastSpontaneousEvent.SpontaneousEventType.MEDIA_STATUS));
        org.junit.Assert.assertNull(media6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        su.litvak.chromecast.api.v2.Media.StreamType streamType6 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media7 = new su.litvak.chromecast.api.v2.Media("", "Namespace{locationName}", (java.lang.Double) 0.0d, streamType6);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        su.litvak.chromecast.api.v2.Media.StreamType streamType14 = su.litvak.chromecast.api.v2.Media.StreamType.buffered;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        su.litvak.chromecast.api.v2.Track.TrackType trackType19 = null;
        su.litvak.chromecast.api.v2.Track track20 = new su.litvak.chromecast.api.v2.Track(1L, trackType19);
        java.lang.String str21 = track20.toString();
        long long22 = track20.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType24 = null;
        su.litvak.chromecast.api.v2.Track track25 = new su.litvak.chromecast.api.v2.Track(1L, trackType24);
        su.litvak.chromecast.api.v2.Track.TrackType trackType27 = null;
        su.litvak.chromecast.api.v2.Track track28 = new su.litvak.chromecast.api.v2.Track(1L, trackType27);
        java.lang.String str29 = track28.toString();
        long long30 = track28.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType32 = null;
        su.litvak.chromecast.api.v2.Track track33 = new su.litvak.chromecast.api.v2.Track(1L, trackType32);
        java.lang.String str34 = track33.toString();
        long long35 = track33.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType37 = null;
        su.litvak.chromecast.api.v2.Track track38 = new su.litvak.chromecast.api.v2.Track(1L, trackType37);
        long long39 = track38.id;
        su.litvak.chromecast.api.v2.Track[] trackArray40 = new su.litvak.chromecast.api.v2.Track[] { track20, track25, track28, track33, track38 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Track> trackList41 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Track>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Track>) trackList41, trackArray40);
        su.litvak.chromecast.api.v2.Media media43 = new su.litvak.chromecast.api.v2.Media("locationLongitude", "Namespace{locationName}", (java.lang.Double) 1.0d, streamType14, strMap15, strMap16, strMap17, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList41);
        su.litvak.chromecast.api.v2.Media media44 = new su.litvak.chromecast.api.v2.Media("hi!", "metadataType", (java.lang.Double) 10.0d, streamType6, strMap8, strMap9, strMap10, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList41);
        org.junit.Assert.assertTrue("'" + streamType6 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType6.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertTrue("'" + streamType14 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.buffered + "'", streamType14.equals(su.litvak.chromecast.api.v2.Media.StreamType.buffered));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Track{id: 1, type: null}" + "'", str21, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Track{id: 1, type: null}" + "'", str29, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Track{id: 1, type: null}" + "'", str34, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertNotNull(trackArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        chromeCast2.disconnect();
        boolean boolean10 = chromeCast2.isAutoReconnect();
        chromeCast2.setAutoReconnect(false);
        chromeCast2.disconnect();
        java.lang.String str14 = chromeCast2.getTitle();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        java.lang.String str3 = chromeCast2.getName();
        java.lang.String str4 = chromeCast2.getAppsURL();
        java.lang.String str5 = chromeCast2.getApplication();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        chromeCast2.disconnect();
        boolean boolean10 = chromeCast2.isAutoReconnect();
        chromeCast2.setAutoReconnect(false);
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException1 = new su.litvak.chromecast.api.v2.ChromeCastException("");
        java.lang.Throwable[] throwableArray2 = chromeCastException1.getSuppressed();
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException4 = new su.litvak.chromecast.api.v2.ChromeCastException("subtitle");
        chromeCastException1.addSuppressed((java.lang.Throwable) chromeCastException4);
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException7 = new su.litvak.chromecast.api.v2.ChromeCastException("width");
        java.lang.Throwable[] throwableArray8 = chromeCastException7.getSuppressed();
        chromeCastException1.addSuppressed((java.lang.Throwable) chromeCastException7);
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException11 = new su.litvak.chromecast.api.v2.ChromeCastException("locationLatitude");
        chromeCastException1.addSuppressed((java.lang.Throwable) chromeCastException11);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        su.litvak.chromecast.api.v2.Media media3 = null;
        su.litvak.chromecast.api.v2.Item item4 = new su.litvak.chromecast.api.v2.Item(false, strMap1, (long) (short) 0, media3);
        su.litvak.chromecast.api.v2.Media media5 = item4.media;
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException7 = new su.litvak.chromecast.api.v2.ChromeCastException("");
        boolean boolean8 = item4.equals((java.lang.Object) chromeCastException7);
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException10 = new su.litvak.chromecast.api.v2.ChromeCastException("");
        chromeCastException7.addSuppressed((java.lang.Throwable) chromeCastException10);
        org.junit.Assert.assertNull(media5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException1 = new su.litvak.chromecast.api.v2.ChromeCastException("Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        boolean boolean3 = chromeCast2.isConnected();
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener4 = null;
        chromeCast2.unregisterListener(chromeCastSpontaneousEventListener4);
        chromeCast2.setAppsURL("_googlecast._tcp.local.");
        boolean boolean8 = chromeCast2.isConnected();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        boolean boolean3 = chromeCast2.isConnected();
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener4 = null;
        chromeCast2.unregisterListener(chromeCastSpontaneousEventListener4);
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener6 = null;
        chromeCast2.registerListener(chromeCastSpontaneousEventListener6);
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener8 = null;
        chromeCast2.unregisterListener(chromeCastSpontaneousEventListener8);
        chromeCast2.setAutoReconnect(false);
        chromeCast2.setName("albumArtist");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        java.lang.String str3 = chromeCast2.getAppsURL();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        chromeCast2.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.MediaStatus mediaStatus7 = chromeCast2.load("Item{id: 10, media: null}");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        su.litvak.chromecast.api.v2.Media.StreamType streamType3 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media4 = new su.litvak.chromecast.api.v2.Media("", "episodeNumber", (java.lang.Double) 1.0d, streamType3);
        org.junit.Assert.assertTrue("'" + streamType3 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType3.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        su.litvak.chromecast.api.v2.Track.TrackType trackType1 = su.litvak.chromecast.api.v2.Track.TrackType.VIDEO;
        su.litvak.chromecast.api.v2.Track track2 = new su.litvak.chromecast.api.v2.Track(1L, trackType1);
        org.junit.Assert.assertTrue("'" + trackType1 + "' != '" + su.litvak.chromecast.api.v2.Track.TrackType.VIDEO + "'", trackType1.equals(su.litvak.chromecast.api.v2.Track.TrackType.VIDEO));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("episodeNumber", (int) (short) 0);
        java.lang.String str3 = chromeCast2.getApplication();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException2 = new su.litvak.chromecast.api.v2.ChromeCastException("");
        java.lang.Throwable[] throwableArray3 = chromeCastException2.getSuppressed();
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException5 = new su.litvak.chromecast.api.v2.ChromeCastException("subtitle");
        chromeCastException2.addSuppressed((java.lang.Throwable) chromeCastException5);
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException7 = new su.litvak.chromecast.api.v2.ChromeCastException("broadcastDate", (java.lang.Throwable) chromeCastException5);
        java.lang.Throwable[] throwableArray8 = chromeCastException7.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        chromeCast2.disconnect();
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener6 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener6);
        java.lang.String str8 = chromeCast2.getAppTitle();
        su.litvak.chromecast.api.v2.Request request10 = null;
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.send("ChromeCast{name: null, title: null, model: null, address: , port: 10}", request10);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        su.litvak.chromecast.api.v2.Volume volume0 = new su.litvak.chromecast.api.v2.Volume();
        su.litvak.chromecast.api.v2.Volume volume1 = new su.litvak.chromecast.api.v2.Volume();
        su.litvak.chromecast.api.v2.ChromeCast chromeCast4 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        java.lang.String str5 = chromeCast4.getName();
        boolean boolean6 = volume1.equals((java.lang.Object) str5);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        su.litvak.chromecast.api.v2.Media media10 = null;
        su.litvak.chromecast.api.v2.Item item11 = new su.litvak.chromecast.api.v2.Item(false, strMap8, (long) (short) 0, media10);
        boolean boolean12 = item11.autoplay;
        boolean boolean13 = item11.autoplay;
        boolean boolean14 = volume1.equals((java.lang.Object) item11);
        boolean boolean15 = volume0.equals((java.lang.Object) boolean14);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        chromeCast2.disconnect();
        java.lang.String str6 = chromeCast2.getAppsURL();
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        java.lang.String str3 = chromeCast2.getName();
        chromeCast2.setName("title");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        su.litvak.chromecast.api.v2.Namespace namespace8 = new su.litvak.chromecast.api.v2.Namespace("discNumber");
        su.litvak.chromecast.api.v2.Namespace namespace10 = new su.litvak.chromecast.api.v2.Namespace("locationName");
        java.lang.String str11 = namespace10.toString();
        su.litvak.chromecast.api.v2.Namespace namespace13 = new su.litvak.chromecast.api.v2.Namespace("");
        su.litvak.chromecast.api.v2.Namespace namespace15 = new su.litvak.chromecast.api.v2.Namespace("");
        su.litvak.chromecast.api.v2.Namespace[] namespaceArray16 = new su.litvak.chromecast.api.v2.Namespace[] { namespace8, namespace10, namespace13, namespace15 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Namespace> namespaceList17 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Namespace>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Namespace>) namespaceList17, namespaceArray16);
        su.litvak.chromecast.api.v2.Application application19 = new su.litvak.chromecast.api.v2.Application("metadataType", "releaseDate", "su.litvak.chromecast.api.v2.ChromeCastException: subtitle", "title", false, false, "Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}", (java.util.List<su.litvak.chromecast.api.v2.Namespace>) namespaceList17);
        java.lang.String str20 = application19.toString();
        java.lang.String str21 = application19.statusText;
        java.lang.String str22 = application19.id;
        java.util.List<su.litvak.chromecast.api.v2.Namespace> namespaceList23 = application19.namespaces;
        boolean boolean24 = application19.isIdleScreen;
        java.lang.String str25 = application19.id;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Namespace{locationName}" + "'", str11, "Namespace{locationName}");
        org.junit.Assert.assertNotNull(namespaceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Application{id: metadataType, name: releaseDate, sessionId: su.litvak.chromecast.api.v2.ChromeCastException: subtitle, statusText: title, transportId: Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}, isIdleScreen: false, launchedFromCloud: false, namespaces: [Namespace{discNumber}, Namespace{locationName}, Namespace{}, Namespace{}]}" + "'", str20, "Application{id: metadataType, name: releaseDate, sessionId: su.litvak.chromecast.api.v2.ChromeCastException: subtitle, statusText: title, transportId: Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}, isIdleScreen: false, launchedFromCloud: false, namespaces: [Namespace{discNumber}, Namespace{locationName}, Namespace{}, Namespace{}]}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "title" + "'", str21, "title");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "metadataType" + "'", str22, "metadataType");
        org.junit.Assert.assertNotNull(namespaceList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "metadataType" + "'", str25, "metadataType");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        su.litvak.chromecast.api.v2.Media.StreamType streamType3 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media4 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = media4.textTrackStyle;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = media4.textTrackStyle;
        su.litvak.chromecast.api.v2.ChromeCast chromeCast9 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast9.setApplication("creationDate");
        java.lang.String str12 = chromeCast9.toString();
        chromeCast9.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        java.lang.String str15 = chromeCast9.getAddress();
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener16 = null;
        chromeCast9.registerConnectionListener(chromeCastConnectionEventListener16);
        boolean boolean18 = media4.equals((java.lang.Object) chromeCastConnectionEventListener16);
        org.junit.Assert.assertTrue("'" + streamType3 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType3.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str12, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        su.litvak.chromecast.api.v2.Media media2 = new su.litvak.chromecast.api.v2.Media("studio", "locationLongitude");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        su.litvak.chromecast.api.v2.Media.StreamType streamType3 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        su.litvak.chromecast.api.v2.Media.StreamType streamType13 = su.litvak.chromecast.api.v2.Media.StreamType.buffered;
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        su.litvak.chromecast.api.v2.Track.TrackType trackType18 = null;
        su.litvak.chromecast.api.v2.Track track19 = new su.litvak.chromecast.api.v2.Track(1L, trackType18);
        java.lang.String str20 = track19.toString();
        long long21 = track19.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType23 = null;
        su.litvak.chromecast.api.v2.Track track24 = new su.litvak.chromecast.api.v2.Track(1L, trackType23);
        su.litvak.chromecast.api.v2.Track.TrackType trackType26 = null;
        su.litvak.chromecast.api.v2.Track track27 = new su.litvak.chromecast.api.v2.Track(1L, trackType26);
        java.lang.String str28 = track27.toString();
        long long29 = track27.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType31 = null;
        su.litvak.chromecast.api.v2.Track track32 = new su.litvak.chromecast.api.v2.Track(1L, trackType31);
        java.lang.String str33 = track32.toString();
        long long34 = track32.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType36 = null;
        su.litvak.chromecast.api.v2.Track track37 = new su.litvak.chromecast.api.v2.Track(1L, trackType36);
        long long38 = track37.id;
        su.litvak.chromecast.api.v2.Track[] trackArray39 = new su.litvak.chromecast.api.v2.Track[] { track19, track24, track27, track32, track37 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Track> trackList40 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Track>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Track>) trackList40, trackArray39);
        su.litvak.chromecast.api.v2.Media media42 = new su.litvak.chromecast.api.v2.Media("locationLongitude", "Namespace{locationName}", (java.lang.Double) 1.0d, streamType13, strMap14, strMap15, strMap16, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList40);
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap44 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = null;
        su.litvak.chromecast.api.v2.Track.TrackType trackType47 = null;
        su.litvak.chromecast.api.v2.Track track48 = new su.litvak.chromecast.api.v2.Track(1L, trackType47);
        su.litvak.chromecast.api.v2.Track.TrackType trackType50 = null;
        su.litvak.chromecast.api.v2.Track track51 = new su.litvak.chromecast.api.v2.Track(1L, trackType50);
        java.lang.String str52 = track51.toString();
        long long53 = track51.id;
        su.litvak.chromecast.api.v2.Track.TrackType trackType55 = null;
        su.litvak.chromecast.api.v2.Track track56 = new su.litvak.chromecast.api.v2.Track(1L, trackType55);
        su.litvak.chromecast.api.v2.Track.TrackType trackType57 = track56.type;
        su.litvak.chromecast.api.v2.Track.TrackType trackType59 = null;
        su.litvak.chromecast.api.v2.Track track60 = new su.litvak.chromecast.api.v2.Track(1L, trackType59);
        su.litvak.chromecast.api.v2.Track[] trackArray61 = new su.litvak.chromecast.api.v2.Track[] { track48, track51, track56, track60 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Track> trackList62 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Track>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Track>) trackList62, trackArray61);
        su.litvak.chromecast.api.v2.Media media64 = new su.litvak.chromecast.api.v2.Media("Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}", "albumArtist", (java.lang.Double) 100.0d, streamType13, strMap43, strMap44, strMap45, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList62);
        su.litvak.chromecast.api.v2.Media media65 = new su.litvak.chromecast.api.v2.Media("artist", "broadcastDate", (java.lang.Double) (-1.0d), streamType3, strMap4, strMap5, strMap6, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList62);
        java.util.Map<java.lang.String, java.lang.Object> strMap66 = media65.metadata;
        org.junit.Assert.assertTrue("'" + streamType3 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType3.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertTrue("'" + streamType13 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.buffered + "'", streamType13.equals(su.litvak.chromecast.api.v2.Media.StreamType.buffered));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Track{id: 1, type: null}" + "'", str20, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Track{id: 1, type: null}" + "'", str28, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Track{id: 1, type: null}" + "'", str33, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertNotNull(trackArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Track{id: 1, type: null}" + "'", str52, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertNull(trackType57);
        org.junit.Assert.assertNotNull(trackArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(strMap66);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        int int3 = chromeCast2.getPort();
        java.lang.String str4 = chromeCast2.getAddress();
        chromeCast2.setName("episodeNumber");
        chromeCast2.setAppsURL("albumArtist");
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.Status status9 = chromeCast2.getStatus();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        su.litvak.chromecast.api.v2.Media.StreamType streamType3 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media4 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType3);
        su.litvak.chromecast.api.v2.Media.StreamType streamType8 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media9 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType8);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = media9.textTrackStyle;
        boolean boolean11 = media4.equals((java.lang.Object) media9);
        su.litvak.chromecast.api.v2.Media.MetadataType metadataType12 = media4.getMetadataType();
        su.litvak.chromecast.api.v2.Media.StreamType streamType13 = media4.streamType;
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = media4.metadata;
        su.litvak.chromecast.api.v2.Media.MetadataType metadataType15 = media4.getMetadataType();
        boolean boolean17 = media4.equals((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("'" + streamType3 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType3.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertTrue("'" + streamType8 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType8.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + metadataType12 + "' != '" + su.litvak.chromecast.api.v2.Media.MetadataType.GENERIC + "'", metadataType12.equals(su.litvak.chromecast.api.v2.Media.MetadataType.GENERIC));
        org.junit.Assert.assertTrue("'" + streamType13 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType13.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertTrue("'" + metadataType15 + "' != '" + su.litvak.chromecast.api.v2.Media.MetadataType.GENERIC + "'", metadataType15.equals(su.litvak.chromecast.api.v2.Media.MetadataType.GENERIC));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        boolean boolean3 = chromeCast2.isConnected();
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener4 = null;
        chromeCast2.unregisterListener(chromeCastSpontaneousEventListener4);
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener6 = null;
        chromeCast2.registerListener(chromeCastSpontaneousEventListener6);
        chromeCast2.setApplication("Item{id: 10, media: null}");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.getAddress();
        java.lang.String str6 = chromeCast2.getName();
        java.lang.String str7 = chromeCast2.getAppTitle();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        su.litvak.chromecast.api.v2.Media.StreamType streamType3 = su.litvak.chromecast.api.v2.Media.StreamType.LIVE;
        su.litvak.chromecast.api.v2.Media media4 = new su.litvak.chromecast.api.v2.Media("episodeNumber", "broadcastDate", (java.lang.Double) 1.0d, streamType3);
        org.junit.Assert.assertTrue("'" + streamType3 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.LIVE + "'", streamType3.equals(su.litvak.chromecast.api.v2.Media.StreamType.LIVE));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        su.litvak.chromecast.api.v2.Track.TrackType trackType1 = null;
        su.litvak.chromecast.api.v2.Track track2 = new su.litvak.chromecast.api.v2.Track(1L, trackType1);
        long long3 = track2.id;
        java.lang.String str4 = track2.toString();
        long long5 = track2.id;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Track{id: 1, type: null}" + "'", str4, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        java.lang.String str8 = chromeCast2.getAddress();
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener9 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener9);
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener11 = null;
        chromeCast2.unregisterConnectionListener(chromeCastConnectionEventListener11);
        java.lang.String str13 = chromeCast2.getAppTitle();
        chromeCast2.setApplication("");
        su.litvak.chromecast.api.v2.Request request17 = null;
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.send("seasonNumber", request17);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException1 = new su.litvak.chromecast.api.v2.ChromeCastException("subtitle");
        java.lang.Throwable[] throwableArray2 = chromeCastException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = chromeCastException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        su.litvak.chromecast.api.v2.Media.StreamType streamType6 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media7 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType6);
        su.litvak.chromecast.api.v2.Media.StreamType streamType11 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media12 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType11);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = media12.textTrackStyle;
        boolean boolean14 = media7.equals((java.lang.Object) media12);
        su.litvak.chromecast.api.v2.Media.MetadataType metadataType15 = media7.getMetadataType();
        su.litvak.chromecast.api.v2.Media.StreamType streamType16 = media7.streamType;
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        su.litvak.chromecast.api.v2.Media.StreamType streamType23 = su.litvak.chromecast.api.v2.Media.StreamType.live;
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = null;
        su.litvak.chromecast.api.v2.Track.TrackType trackType28 = null;
        su.litvak.chromecast.api.v2.Track track29 = new su.litvak.chromecast.api.v2.Track(1L, trackType28);
        java.lang.String str30 = track29.toString();
        su.litvak.chromecast.api.v2.Track.TrackType trackType32 = null;
        su.litvak.chromecast.api.v2.Track track33 = new su.litvak.chromecast.api.v2.Track(1L, trackType32);
        su.litvak.chromecast.api.v2.Track.TrackType trackType34 = track33.type;
        java.lang.String str35 = track33.toString();
        su.litvak.chromecast.api.v2.Track[] trackArray36 = new su.litvak.chromecast.api.v2.Track[] { track29, track33 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Track> trackList37 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Track>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Track>) trackList37, trackArray36);
        su.litvak.chromecast.api.v2.Media media39 = new su.litvak.chromecast.api.v2.Media("Application{id: metadataType, name: releaseDate, sessionId: su.litvak.chromecast.api.v2.ChromeCastException: subtitle, statusText: title, transportId: Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}, isIdleScreen: false, launchedFromCloud: false, namespaces: [Namespace{discNumber}, Namespace{locationName}, Namespace{}, Namespace{}]}", "broadcastDate", (java.lang.Double) 100.0d, streamType23, strMap24, strMap25, strMap26, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList37);
        su.litvak.chromecast.api.v2.Media media40 = new su.litvak.chromecast.api.v2.Media("", "locationName", (java.lang.Double) 0.0d, streamType16, strMap17, strMap18, strMap19, (java.util.List<su.litvak.chromecast.api.v2.Track>) trackList37);
        org.junit.Assert.assertTrue("'" + streamType6 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType6.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertTrue("'" + streamType11 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType11.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + metadataType15 + "' != '" + su.litvak.chromecast.api.v2.Media.MetadataType.GENERIC + "'", metadataType15.equals(su.litvak.chromecast.api.v2.Media.MetadataType.GENERIC));
        org.junit.Assert.assertTrue("'" + streamType16 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType16.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertTrue("'" + streamType23 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.live + "'", streamType23.equals(su.litvak.chromecast.api.v2.Media.StreamType.live));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Track{id: 1, type: null}" + "'", str30, "Track{id: 1, type: null}");
        org.junit.Assert.assertNull(trackType34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Track{id: 1, type: null}" + "'", str35, "Track{id: 1, type: null}");
        org.junit.Assert.assertNotNull(trackArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        su.litvak.chromecast.api.v2.Media media3 = null;
        su.litvak.chromecast.api.v2.Item item4 = new su.litvak.chromecast.api.v2.Item(false, strMap1, (long) (short) 0, media3);
        su.litvak.chromecast.api.v2.Media media5 = item4.media;
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException7 = new su.litvak.chromecast.api.v2.ChromeCastException("");
        boolean boolean8 = item4.equals((java.lang.Object) chromeCastException7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = item4.customData;
        org.junit.Assert.assertNull(media5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        su.litvak.chromecast.api.v2.Namespace namespace15 = new su.litvak.chromecast.api.v2.Namespace("discNumber");
        su.litvak.chromecast.api.v2.Namespace namespace17 = new su.litvak.chromecast.api.v2.Namespace("locationName");
        java.lang.String str18 = namespace17.toString();
        su.litvak.chromecast.api.v2.Namespace namespace20 = new su.litvak.chromecast.api.v2.Namespace("");
        su.litvak.chromecast.api.v2.Namespace namespace22 = new su.litvak.chromecast.api.v2.Namespace("");
        su.litvak.chromecast.api.v2.Namespace[] namespaceArray23 = new su.litvak.chromecast.api.v2.Namespace[] { namespace15, namespace17, namespace20, namespace22 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Namespace> namespaceList24 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Namespace>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Namespace>) namespaceList24, namespaceArray23);
        su.litvak.chromecast.api.v2.Application application26 = new su.litvak.chromecast.api.v2.Application("metadataType", "releaseDate", "su.litvak.chromecast.api.v2.ChromeCastException: subtitle", "title", false, false, "Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}", (java.util.List<su.litvak.chromecast.api.v2.Namespace>) namespaceList24);
        su.litvak.chromecast.api.v2.Application application27 = new su.litvak.chromecast.api.v2.Application("albumArtist", "locationLatitude", "Media{url: , contentType: width, duration: -1.0}", "", false, false, "composer", (java.util.List<su.litvak.chromecast.api.v2.Namespace>) namespaceList24);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Namespace{locationName}" + "'", str18, "Namespace{locationName}");
        org.junit.Assert.assertNotNull(namespaceArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.Status status9 = chromeCast2.getStatus();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        boolean boolean3 = chromeCast2.isConnected();
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener4 = null;
        chromeCast2.unregisterListener(chromeCastSpontaneousEventListener4);
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener6 = null;
        chromeCast2.registerListener(chromeCastSpontaneousEventListener6);
        java.lang.String str8 = chromeCast2.getModel();
        java.lang.String str9 = chromeCast2.getModel();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        su.litvak.chromecast.api.v2.Media media3 = null;
        su.litvak.chromecast.api.v2.Item item4 = new su.litvak.chromecast.api.v2.Item(false, strMap1, (long) (byte) 10, media3);
        boolean boolean5 = item4.autoplay;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = item4.customData;
        long long7 = item4.id;
        java.lang.String str8 = item4.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = item4.customData;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item{id: 10, media: null}" + "'", str8, "Item{id: 10, media: null}");
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.stopApp();
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        java.lang.String str3 = chromeCast2.toString();
        chromeCast2.disconnect();
        chromeCast2.setAutoReconnect(true);
        java.lang.String str7 = chromeCast2.getTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str3, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        su.litvak.chromecast.api.v2.Media media3 = null;
        su.litvak.chromecast.api.v2.Item item4 = new su.litvak.chromecast.api.v2.Item(false, strMap1, (long) (byte) 10, media3);
        boolean boolean5 = item4.autoplay;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = item4.customData;
        long long7 = item4.id;
        java.lang.String str8 = item4.toString();
        java.lang.String str9 = item4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item{id: 10, media: null}" + "'", str8, "Item{id: 10, media: null}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item{id: 10, media: null}" + "'", str9, "Item{id: 10, media: null}");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        java.lang.String str3 = chromeCast2.toString();
        su.litvak.chromecast.api.v2.ChromeCastSpontaneousEventListener chromeCastSpontaneousEventListener4 = null;
        chromeCast2.registerListener(chromeCastSpontaneousEventListener4);
        chromeCast2.setAutoReconnect(true);
        java.lang.String str8 = chromeCast2.getAppsURL();
        boolean boolean9 = chromeCast2.isAutoReconnect();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str3, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        su.litvak.chromecast.api.v2.Namespace namespace8 = new su.litvak.chromecast.api.v2.Namespace("discNumber");
        su.litvak.chromecast.api.v2.Namespace namespace10 = new su.litvak.chromecast.api.v2.Namespace("locationName");
        java.lang.String str11 = namespace10.toString();
        su.litvak.chromecast.api.v2.Namespace namespace13 = new su.litvak.chromecast.api.v2.Namespace("");
        su.litvak.chromecast.api.v2.Namespace namespace15 = new su.litvak.chromecast.api.v2.Namespace("");
        su.litvak.chromecast.api.v2.Namespace[] namespaceArray16 = new su.litvak.chromecast.api.v2.Namespace[] { namespace8, namespace10, namespace13, namespace15 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Namespace> namespaceList17 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Namespace>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Namespace>) namespaceList17, namespaceArray16);
        su.litvak.chromecast.api.v2.Application application19 = new su.litvak.chromecast.api.v2.Application("metadataType", "releaseDate", "su.litvak.chromecast.api.v2.ChromeCastException: subtitle", "title", false, false, "Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}", (java.util.List<su.litvak.chromecast.api.v2.Namespace>) namespaceList17);
        java.lang.String str20 = application19.toString();
        java.lang.String str21 = application19.name;
        java.lang.String str22 = application19.id;
        java.lang.String str23 = application19.name;
        java.util.List<su.litvak.chromecast.api.v2.Namespace> namespaceList24 = application19.namespaces;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Namespace{locationName}" + "'", str11, "Namespace{locationName}");
        org.junit.Assert.assertNotNull(namespaceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Application{id: metadataType, name: releaseDate, sessionId: su.litvak.chromecast.api.v2.ChromeCastException: subtitle, statusText: title, transportId: Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}, isIdleScreen: false, launchedFromCloud: false, namespaces: [Namespace{discNumber}, Namespace{locationName}, Namespace{}, Namespace{}]}" + "'", str20, "Application{id: metadataType, name: releaseDate, sessionId: su.litvak.chromecast.api.v2.ChromeCastException: subtitle, statusText: title, transportId: Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}, isIdleScreen: false, launchedFromCloud: false, namespaces: [Namespace{discNumber}, Namespace{locationName}, Namespace{}, Namespace{}]}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "releaseDate" + "'", str21, "releaseDate");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "metadataType" + "'", str22, "metadataType");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "releaseDate" + "'", str23, "releaseDate");
        org.junit.Assert.assertNotNull(namespaceList24);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException2 = new su.litvak.chromecast.api.v2.ChromeCastException("");
        java.lang.Throwable[] throwableArray3 = chromeCastException2.getSuppressed();
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException4 = new su.litvak.chromecast.api.v2.ChromeCastException("width", (java.lang.Throwable) chromeCastException2);
        java.lang.String str5 = chromeCastException4.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "su.litvak.chromecast.api.v2.ChromeCastException: width" + "'", str5, "su.litvak.chromecast.api.v2.ChromeCastException: width");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        su.litvak.chromecast.api.v2.Media media3 = null;
        su.litvak.chromecast.api.v2.Item item4 = new su.litvak.chromecast.api.v2.Item(false, strMap1, (long) (short) 0, media3);
        su.litvak.chromecast.api.v2.Media media5 = item4.media;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = item4.customData;
        boolean boolean7 = item4.autoplay;
        org.junit.Assert.assertNull(media5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.getAddress();
        java.lang.String str6 = chromeCast2.getName();
        chromeCast2.setAppsURL("Item{id: 0, media: null}");
        su.litvak.chromecast.api.v2.ChromeCastConnectionEventListener chromeCastConnectionEventListener9 = null;
        chromeCast2.registerConnectionListener(chromeCastConnectionEventListener9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException2 = new su.litvak.chromecast.api.v2.ChromeCastException("width");
        java.lang.Throwable[] throwableArray3 = chromeCastException2.getSuppressed();
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException5 = new su.litvak.chromecast.api.v2.ChromeCastException("locationLatitude");
        chromeCastException2.addSuppressed((java.lang.Throwable) chromeCastException5);
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException7 = new su.litvak.chromecast.api.v2.ChromeCastException("Application{id: metadataType, name: releaseDate, sessionId: su.litvak.chromecast.api.v2.ChromeCastException: subtitle, statusText: title, transportId: Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}, isIdleScreen: false, launchedFromCloud: false, namespaces: [Namespace{discNumber}, Namespace{locationName}, Namespace{}, Namespace{}]}", (java.lang.Throwable) chromeCastException2);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        chromeCast2.disconnect();
        java.lang.String str9 = chromeCast2.getTitle();
        chromeCast2.setApplication("_googlecast._tcp.local.");
        boolean boolean12 = chromeCast2.isAutoReconnect();
        su.litvak.chromecast.api.v2.Media.StreamType streamType16 = su.litvak.chromecast.api.v2.Media.StreamType.none;
        su.litvak.chromecast.api.v2.Media media17 = new su.litvak.chromecast.api.v2.Media("Namespace{}", "broadcastDate", (java.lang.Double) 0.0d, streamType16);
        java.lang.String str18 = media17.url;
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = media17.metadata;
        // The following exception was thrown during execution in test generation
        try {
            su.litvak.chromecast.api.v2.MediaStatus mediaStatus20 = chromeCast2.load(media17);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + streamType16 + "' != '" + su.litvak.chromecast.api.v2.Media.StreamType.none + "'", streamType16.equals(su.litvak.chromecast.api.v2.Media.StreamType.none));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Namespace{}" + "'", str18, "Namespace{}");
        org.junit.Assert.assertNull(strMap19);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        java.lang.String str3 = chromeCast2.toString();
        // The following exception was thrown during execution in test generation
        try {
            chromeCast2.setMuted(true);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str3, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        su.litvak.chromecast.api.v2.Namespace namespace15 = new su.litvak.chromecast.api.v2.Namespace("discNumber");
        su.litvak.chromecast.api.v2.Namespace namespace17 = new su.litvak.chromecast.api.v2.Namespace("locationName");
        java.lang.String str18 = namespace17.toString();
        su.litvak.chromecast.api.v2.Namespace namespace20 = new su.litvak.chromecast.api.v2.Namespace("");
        su.litvak.chromecast.api.v2.Namespace namespace22 = new su.litvak.chromecast.api.v2.Namespace("");
        su.litvak.chromecast.api.v2.Namespace[] namespaceArray23 = new su.litvak.chromecast.api.v2.Namespace[] { namespace15, namespace17, namespace20, namespace22 };
        java.util.ArrayList<su.litvak.chromecast.api.v2.Namespace> namespaceList24 = new java.util.ArrayList<su.litvak.chromecast.api.v2.Namespace>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<su.litvak.chromecast.api.v2.Namespace>) namespaceList24, namespaceArray23);
        su.litvak.chromecast.api.v2.Application application26 = new su.litvak.chromecast.api.v2.Application("metadataType", "releaseDate", "su.litvak.chromecast.api.v2.ChromeCastException: subtitle", "title", false, false, "Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}", (java.util.List<su.litvak.chromecast.api.v2.Namespace>) namespaceList24);
        java.lang.String str27 = application26.toString();
        java.lang.String str28 = application26.statusText;
        java.lang.String str29 = application26.id;
        java.util.List<su.litvak.chromecast.api.v2.Namespace> namespaceList30 = application26.namespaces;
        su.litvak.chromecast.api.v2.Application application31 = new su.litvak.chromecast.api.v2.Application("albumName", "su.litvak.chromecast.api.v2.ChromeCastException: subtitle", "locationName", "attenuation", false, true, "su.litvak.chromecast.api.v2.ChromeCastException: seasonNumber", namespaceList30);
        java.lang.String str32 = application31.id;
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Namespace{locationName}" + "'", str18, "Namespace{locationName}");
        org.junit.Assert.assertNotNull(namespaceArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Application{id: metadataType, name: releaseDate, sessionId: su.litvak.chromecast.api.v2.ChromeCastException: subtitle, statusText: title, transportId: Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}, isIdleScreen: false, launchedFromCloud: false, namespaces: [Namespace{discNumber}, Namespace{locationName}, Namespace{}, Namespace{}]}" + "'", str27, "Application{id: metadataType, name: releaseDate, sessionId: su.litvak.chromecast.api.v2.ChromeCastException: subtitle, statusText: title, transportId: Media{url: Namespace{}, contentType: broadcastDate, duration: 0.0}, isIdleScreen: false, launchedFromCloud: false, namespaces: [Namespace{discNumber}, Namespace{locationName}, Namespace{}, Namespace{}]}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "title" + "'", str28, "title");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "metadataType" + "'", str29, "metadataType");
        org.junit.Assert.assertNotNull(namespaceList30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "albumName" + "'", str32, "albumName");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        su.litvak.chromecast.api.v2.Volume volume0 = new su.litvak.chromecast.api.v2.Volume();
        java.lang.String str1 = volume0.toString();
        java.lang.String str2 = volume0.controlType;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Volume{level: -1.0, muted: false, increment: 0.05, stepInterval: 0.05000000074505806, controlType: attenuation}" + "'", str1, "Volume{level: -1.0, muted: false, increment: 0.05, stepInterval: 0.05000000074505806, controlType: attenuation}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "attenuation" + "'", str2, "attenuation");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        su.litvak.chromecast.api.v2.ChromeCast chromeCast2 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        chromeCast2.setApplication("creationDate");
        java.lang.String str5 = chromeCast2.toString();
        chromeCast2.setAppsURL("ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        java.lang.String str8 = chromeCast2.getAddress();
        java.lang.String str9 = chromeCast2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str5, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ChromeCast{name: null, title: null, model: null, address: , port: 10}" + "'", str9, "ChromeCast{name: null, title: null, model: null, address: , port: 10}");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException1 = new su.litvak.chromecast.api.v2.ChromeCastException("width");
        java.lang.Throwable[] throwableArray2 = chromeCastException1.getSuppressed();
        su.litvak.chromecast.api.v2.ChromeCastException chromeCastException4 = new su.litvak.chromecast.api.v2.ChromeCastException("locationLatitude");
        chromeCastException1.addSuppressed((java.lang.Throwable) chromeCastException4);
        java.lang.Throwable[] throwableArray6 = chromeCastException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        su.litvak.chromecast.api.v2.Track.TrackType trackType1 = null;
        su.litvak.chromecast.api.v2.Track track2 = new su.litvak.chromecast.api.v2.Track(1L, trackType1);
        java.lang.String str3 = track2.toString();
        java.lang.String str4 = track2.toString();
        java.lang.String str5 = track2.toString();
        long long6 = track2.id;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Track{id: 1, type: null}" + "'", str3, "Track{id: 1, type: null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Track{id: 1, type: null}" + "'", str4, "Track{id: 1, type: null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Track{id: 1, type: null}" + "'", str5, "Track{id: 1, type: null}");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        su.litvak.chromecast.api.v2.Volume volume0 = new su.litvak.chromecast.api.v2.Volume();
        su.litvak.chromecast.api.v2.ChromeCast chromeCast3 = new su.litvak.chromecast.api.v2.ChromeCast("", (int) (short) 10);
        java.lang.String str4 = chromeCast3.getName();
        boolean boolean5 = volume0.equals((java.lang.Object) str4);
        java.lang.String str6 = volume0.toString();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Volume{level: -1.0, muted: false, increment: 0.05, stepInterval: 0.05000000074505806, controlType: attenuation}" + "'", str6, "Volume{level: -1.0, muted: false, increment: 0.05, stepInterval: 0.05000000074505806, controlType: attenuation}");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        su.litvak.chromecast.api.v2.Volume volume5 = new su.litvak.chromecast.api.v2.Volume((java.lang.Float) 0.0f, false, (java.lang.Float) 10.0f, (java.lang.Double) 1.0d, "seasonNumber");
        java.lang.String str6 = volume5.controlType;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "seasonNumber" + "'", str6, "seasonNumber");
    }
}

