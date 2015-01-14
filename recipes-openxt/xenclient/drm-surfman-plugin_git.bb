DESCRIPTION = "Plugin for Surfman using libDRM"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=321bf41f280cf805086dd5a720b37785"
DEPENDS = "libsurfman udev libdrm mesa-dri (>=9.1.4)"
RDEPENDS = "mesa-dri-driver-nouveau mesa-dri-driver-nouveau-vieux mesa-dri-driver-i965"
INSANE_SKIP_${PN} = "dev-so"

PV = "0+git${SRCPV}"

SRCREV = "${AUTOREV}"
SRC_URI = "git:///github.com/ktemkin/surfman.git;branch=opengl;protocol=${OPENXT_GIT_PROTOCOL}"
#SRC_URI = "git://${OPENXT_GIT_MIRROR}/surfman.git;protocol=${OPENXT_GIT_PROTOCOL};branch=${OPENXT_BRANCH}"

S = "${WORKDIR}/git/plugins/drm/"

PACKAGES = "${PN}-dev ${PN}-dbg ${PN}"
FILES_${PN}-dev += " /usr/lib/surfman/*.a /usr/lib/surfman/*.la "
FILES_${PN}-dbg += " /usr/lib/surfman/.debug/* "
FILES_${PN} += " /usr/lib/surfman/* "

inherit autotools
inherit pkgconfig
inherit xenclient
