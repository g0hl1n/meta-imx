SRCBRANCH = "lf-5.10.52_2.1.0"
SRCREV = "9bd24e99c3afd7dea96c3cfb997c41beed84c87c" 
IMX_JAILHOUSE_SRC ?= "git://github.com/nxp-imx/imx-jailhouse.git;protocol=https"
SRC_URI = "${IMX_JAILHOUSE_SRC};branch=${SRCBRANCH} \
           file://0001-tools-scripts-update-shebang-to-python3.patch \
"

do_install_append() {
    install -d ${D}${PYTHON_SITEPACKAGES_DIR}/pyjailhouse
    install -m 0644 ${S}/pyjailhouse/*.py ${D}${PYTHON_SITEPACKAGES_DIR}/pyjailhouse
}

FILES_${PN} += "${nonarch_base_libdir}/firmware"

RDEPENDS_${PN} += " \
    pyjailhouse \
"

COMPATIBLE_MACHINE = "(mx8m|mx8ulp)"
