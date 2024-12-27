class ShuffleCipher extends Cipher implements MessageEncoder, MessageDecoder {
    // field for how many times text is shuffled
    private int n;

    // constructor
    public ShuffleCipher(int n) {
        this.n = n;
    }

    // encode method
    public String encode(String plainText) {
        StringBuilder encodedText = new StringBuilder(plainText);
        for (int i = 0; i < n; i++) {
            encodedText = shuffle(encodedText);
        }
        return encodedText.toString();
    }

    // decode method
    public String decode(String cipherText) {
        // pass the cipherText to encode function to decode 
        return encode(cipherText);
    }

    // method that shuffles text
    private StringBuilder shuffle(StringBuilder text) {
        StringBuilder shuffledText = new StringBuilder();
        int m = text.length() / 2;
        String half1 = text.substring(0, m);
        String half2 = text.substring(m);

        for (int i = 0; i < m; i++) {
            shuffledText.append(half1.charAt(i));
            shuffledText.append(half2.charAt(i));
        }
        if (text.length() % 2 != 0) {
            shuffledText.append(half2.charAt(m));
        }
        return shuffledText;
    }

    // function to return the cipher type
    public String cipherType() {
        return "ShuffleCipher";
    }
}

