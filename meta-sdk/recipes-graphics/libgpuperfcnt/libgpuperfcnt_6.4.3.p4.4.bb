DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d3c315c6eaa43e07d8c130dc3a04a011" 

SRC_URI[arm-fb.md5sum] = "dee727d2c3c29b7588ec5c33333efc1d"
SRC_URI[arm-fb.sha256sum] = "5360cdeb19ada88642267ba99650d11ffd598212f8518a858219a6a287d3f21a"

SRC_URI[arm-wayland.md5sum] = "030a34297c0a7b0ea1b0b8bfada9fee8"
SRC_URI[arm-wayland.sha256sum] = "7443305648224df5517e2aa1319a61384d072116dcc8f9cdcc9650cfda666b8d"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "ea90dd7d453f6b15260d492f58e39ee1"
SRC_URI[aarch64-wayland.sha256sum] = "4ae44a10601ad0f727359c3a3a8f761703e5864d2481b7089e46ab54273ae871"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"