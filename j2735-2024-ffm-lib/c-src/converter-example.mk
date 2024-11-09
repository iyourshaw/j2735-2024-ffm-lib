include Makefile.am.libasncodec

LIBS += -lm
CFLAGS += $(ASN_MODULE_CFLAGS) -DASN_PDU_COLLECTION -I. -fPIC
ASN_LIBRARY ?= libasncodec.a
ASN_PROGRAM ?= converter-example
ASN_PROGRAM_SRCS ?= \
	converter-example.c\
	pdu_collection.c

all: $(ASN_PROGRAM)

$(ASN_PROGRAM): $(ASN_LIBRARY) $(ASN_PROGRAM_SRCS:.c=.o)
	$(CC) $(CFLAGS) $(CPPFLAGS) -o $(ASN_PROGRAM) $(ASN_PROGRAM_SRCS:.c=.o) $(LDFLAGS) $(ASN_LIBRARY) $(LIBS)

$(ASN_LIBRARY): $(ASN_MODULE_SRCS:.c=.o)
	$(AR) rcs $@ $(ASN_MODULE_SRCS:.c=.o)

%.o: %.c
	$(CC) $(CFLAGS) -o $@ -c $<

clean:
	rm -f $(ASN_PROGRAM) $(ASN_LIBRARY)
	rm -f $(ASN_MODULE_SRCS:.c=.o) $(ASN_PROGRAM_SRCS:.c=.o)

regen: regenerate-from-asn1-source

regenerate-from-asn1-source:
	asn1c -fcompound-names -fincludes-quoted -pdu=all asn/ISO17573-EfcDataDictionary.asn asn/J2540-2-J2540ITIS-2024-rel-v1.1.1.asn asn/J2735-AddGrpB-2024-rel-v1.1.asn asn/J2735-AddGrpC-2024-rel-v1.1.asn asn/J2735-BasicSafetyMessage-2024-rel-v1.1.2.asn asn/J2735-Common-2024-rel-v1.1.2.asn asn/J2735-CommonSafetyRequest-2024-rel-v1.1.asn asn/J2735-EmergencyVehicleAlert-2024-rel-v1.1.asn asn/J2735-ITIS-2024-rel-v1.1.asn asn/J2735-IntersectionCollision-2024-rel-v1.1.asn asn/J2735-MapData-2024-rel-v1.1.asn asn/J2735-MessageFrame-2024-rel-v1.1.1.asn asn/J2735-NMEAcorrections-2024-rel-v1.1.asn asn/J2735-NTCIP-2024-rel-v1.1.asn asn/J2735-PersonalSafetyMessage-2024-rel-v1.1.asn asn/J2735-ProbeDataManagement-2024-rel-v1.1.asn asn/J2735-ProbeVehicleData-2024-rel-v1.1.asn asn/J2735-REGION-2024-rel-v1.1.asn asn/J2735-RTCMcorrections-2024-rel-v1.1.asn asn/J2735-RoadSideAlert-2024-rel-v1.1.asn asn/J2735-SCPR-2024-ph-v1.1.asn asn/J2735-SCPS-2024-ph-v1.1.asn asn/J2735-SPAT-2024-rel-v1.1.1.asn asn/J2735-SignalRequestMessage-2024-rel-v1.1.asn asn/J2735-SignalStatusMessage-2024-rel-v1.1.asn asn/J2735-TSPAT-2024-ph-v1.1.asn asn/J2735-TestMessages-2024-rel-v1.1.asn asn/J2735-TrafficLightStatusMessage-2024-rel-v1.1.2.asn asn/J2735-TravelerInformation-2024-rel-v1.1.2.asn asn/J2945-3-RoadWeatherMessage-2024-rel-v2.1.asn asn/J2945-4-RoadSafetyMessage-2024-rel-v1.1.1.asn asn/J2945-6-CooperativeControlMessage-2024-rel-v1.1.1.asn asn/J2945-9-PersonalSafetyMessage2-2024-ph-v1.1.asn asn/J2945-A-RGA-2024-ph-v1.1.asn asn/J2945-C-ProbeDataConfig-2024-rel-v1.1.asn asn/J2945-C-ProbeDataReport-2024-rel-v1.1.asn asn/J3186-ManeuverSharingandCoordinatingMessage-2024-rel-v1.1.asn asn/J3217-R-RoadUserChargingConfigMsg-2024-rel-v1.1.1.asn asn/J3217-R-RoadUserChargingReportMsg-2024-rel-v1.1.asn asn/J3217-TollAdvertisementMsg-2024-rel-v1.1.asn asn/J3217-TollUsageAckMsg-2024-rel-v1.1.asn asn/J3217-TollUsageMsg-2024-rel-v1.1.asn asn/J3224-SensorDataSharingMessage-2024-rel-v1.1.asn
