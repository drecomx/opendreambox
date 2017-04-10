SUMMARY = "EMC is an enhanced movielist replacement"
HOMEPAGE = "http://www.i-have-a-dreambox.com/wbb2/thread.php?threadid=156282"
LICENSE = "GPLv3+"
LIC_FILES_CHKSUM = "file://src/EnhancedMovieCenter.py;beginline=3;endline=20;md5=450164fbb85f5600d7527e78a47b314c"
DEPENDS = "gettext-native"
SRCREV = "cdf5fa632766d7e863fd78969e1c66efce6515ba"
PV = "3.7.4+git${SRCPV}"

SRC_URI = "git://github.com/opendreambox/e2openplugin-EnhancedMovieCenter.git"

S = "${WORKDIR}/git"

inherit autotools-brokensep pythonnative

RDEPENDS_${PN} = " \
    enigma2 \
    python-json \
    python-shell \
    python-twisted-web \
"

FILES_${PN} += "${libdir}/enigma2/python"
