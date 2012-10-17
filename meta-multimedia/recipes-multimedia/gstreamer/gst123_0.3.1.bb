SUMMARY = "Flexible CLI player in the spirit of mpg123, based on GStreamer"
HOMEPAGE = "http://space.twc.de/~stefan/gst123.php"
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
                    file://src/gst123.cc;beginline=1;endline=19;md5=05d2f5d54b985b986c26af931d2084f8"

DEPENDS = "libx11 gstreamer gtk+ ncurses"

PR = "r0"

# This is actually the commit after 0.3.1 which fixes a display bug
SRCREV = "3e46d2e501da68d929bb5f26900a292a5fc04a1f"

SRC_URI = "git://space.twc.de/public/git/gst123.git;protocol=http"

S = "${WORKDIR}/git"

inherit autotools
