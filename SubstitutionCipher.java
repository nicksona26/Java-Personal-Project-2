class SubstitutionCipher extends Cipher implements MessageEncoder, MessageDecoder {
    // int field for how much letters will be shifted
    private int shift;

    // constructor
    public SubstitutionCipher(int shift) {
        this.shift = shift;
    }

    // method to encode the plainText using substitution cipher
    public String encode(String plainText) {
        StringBuilder encodedText = new StringBuilder();

        for (char c : plainText.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                char encodedChar = (char) (((c - base + shift) % 26) + base);
                encodedText.append(encodedChar);
            } else if (c == ' ') {
                encodedText.append('#');
            } else {
                encodedText.append(c);
            }
        }

        return encodedText.toString();
    }

    // method to decode the plainText using substitution cipher
    public String decode(String cipherText) {
        StringBuilder decodedText = new StringBuilder();

        for (char c : cipherText.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                char decodedChar = (char) (((c - base - shift + 26) % 26) + base);
                decodedText.append(decodedChar);
            } else if (c == '#') {
                decodedText.append(' ');
            } else {
                decodedText.append(c);
            }
        }

        return decodedText.toString();
    }

    // method to return cipher type
    public String cipherType() {
        return "SubstitutionCipher";
    }
}
