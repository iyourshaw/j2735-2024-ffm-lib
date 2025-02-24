/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "ProbeDataReport"
 * 	found in "asn/J2945-C-ProbeDataReport-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_RptCommSysPerfEvents_H_
#define	_RptCommSysPerfEvents_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NULL.h"
#include "OCTET_STRING.h"
#include "NativeInteger.h"
#include "constr_CHOICE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum RptCommSysPerfEvents_PR {
	RptCommSysPerfEvents_PR_NOTHING,	/* No components present */
	RptCommSysPerfEvents_PR_j2945_1ChanBusy,
	RptCommSysPerfEvents_PR_rfDataRsuInfo,
	RptCommSysPerfEvents_PR_numOfRsusObserved,
	RptCommSysPerfEvents_PR_rfV2xJamDetect,
	RptCommSysPerfEvents_PR_j2945_1VehDens,
	RptCommSysPerfEvents_PR_j2945_1CqiBelow,
	RptCommSysPerfEvents_PR_j2945_1TrackingError,
	RptCommSysPerfEvents_PR_gnssHdopExceeds,
	RptCommSysPerfEvents_PR_gnssErrElipse,
	RptCommSysPerfEvents_PR_gnssSatsBelow,
	RptCommSysPerfEvents_PR_jammingDetect
	/* Extensions may appear below */
	
} RptCommSysPerfEvents_PR;

/* RptCommSysPerfEvents */
typedef struct RptCommSysPerfEvents {
	RptCommSysPerfEvents_PR present;
	union RptCommSysPerfEvents_u {
		NULL_t	 j2945_1ChanBusy;
		OCTET_STRING_t	 rfDataRsuInfo;
		long	 numOfRsusObserved;
		NULL_t	 rfV2xJamDetect;
		NULL_t	 j2945_1VehDens;
		NULL_t	 j2945_1CqiBelow;
		NULL_t	 j2945_1TrackingError;
		NULL_t	 gnssHdopExceeds;
		NULL_t	 gnssErrElipse;
		NULL_t	 gnssSatsBelow;
		NULL_t	 jammingDetect;
		/*
		 * This type is extensible,
		 * possible extensions are below.
		 */
	} choice;
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} RptCommSysPerfEvents_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_RptCommSysPerfEvents;
extern asn_CHOICE_specifics_t asn_SPC_RptCommSysPerfEvents_specs_1;
extern asn_TYPE_member_t asn_MBR_RptCommSysPerfEvents_1[11];
extern asn_per_constraints_t asn_PER_type_RptCommSysPerfEvents_constr_1;

#ifdef __cplusplus
}
#endif

#endif	/* _RptCommSysPerfEvents_H_ */
#include "asn_internal.h"
