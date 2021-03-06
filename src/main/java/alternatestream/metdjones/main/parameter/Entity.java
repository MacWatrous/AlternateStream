package alternatestream.metdjones.main.parameter;

public interface Entity extends Parameter{
    public enum Movie implements Entity{
        ARTIST ("movieArtist"),
        MOVIE ("movie");

        private final String value;
        Movie(String value){
            this.value = value;
        }

        public String getValue(){
            return value;
        }

        @Override
        public String createParameter() {
            return "entity="+value;
        }
    }

    public enum Podcast implements Entity{
        AUTHOR ("podcastAuthor"),
        PODCAST("podcast");

        private final String value;
        Podcast(String value){
            this.value = value;
        }

        @Override
        public String createParameter() {
            return "entity="+value;
        }
    }
    public enum Music implements Entity{
        ARTIST ("musicArtist"),
        TRACK ("musicTrack"),
        ALBUM ("album");

        private final String value;
            Music(String value){
            this.value = value;
        }

        @Override
        public String createParameter() {
            return "entity="+value;
        }
    }
}
