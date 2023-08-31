def call(String line) {
    def ansiColorMap = load("ansiColorMap.groovy")

    if (line.startsWith("[INFO]")) {
        return ansiColorMap.green + line + ansiColorMap.reset
    } else if (line.startsWith("[WARNING]")) {
        return ansiColorMap.red + line + ansiColorMap.reset
    } else if (line.startsWith("[debug]")) {
        return ansiColorMap.magenta + line + ansiColorMap.reset
    } else {
        return line
    }
}
