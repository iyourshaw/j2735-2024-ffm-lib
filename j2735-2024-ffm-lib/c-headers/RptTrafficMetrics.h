/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "ProbeDataReport"
 * 	found in "asn/J2945-C-ProbeDataReport-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_RptTrafficMetrics_H_
#define	_RptTrafficMetrics_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NULL.h"
#include "constr_CHOICE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum RptTrafficMetrics_PR {
	RptTrafficMetrics_PR_NOTHING,	/* No components present */
	RptTrafficMetrics_PR_trfsigApproachDelay,
	RptTrafficMetrics_PR_trfsigApproachSpeed,
	RptTrafficMetrics_PR_trfsigArrivalGreen,
	RptTrafficMetrics_PR_trfsigArrivalRed,
	RptTrafficMetrics_PR_trfsigPedDelay,
	RptTrafficMetrics_PR_trfsigSpatMismatch,
	RptTrafficMetrics_PR_trfsigSpatTimingError
	/* Extensions may appear below */
	
} RptTrafficMetrics_PR;

/* RptTrafficMetrics */
typedef struct RptTrafficMetrics {
	RptTrafficMetrics_PR present;
	union RptTrafficMetrics_u {
		NULL_t	 trfsigApproachDelay;
		NULL_t	 trfsigApproachSpeed;
		NULL_t	 trfsigArrivalGreen;
		NULL_t	 trfsigArrivalRed;
		NULL_t	 trfsigPedDelay;
		NULL_t	 trfsigSpatMismatch;
		NULL_t	 trfsigSpatTimingError;
		/*
		 * This type is extensible,
		 * possible extensions are below.
		 */
	} choice;
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} RptTrafficMetrics_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_RptTrafficMetrics;
extern asn_CHOICE_specifics_t asn_SPC_RptTrafficMetrics_specs_1;
extern asn_TYPE_member_t asn_MBR_RptTrafficMetrics_1[7];
extern asn_per_constraints_t asn_PER_type_RptTrafficMetrics_constr_1;

#ifdef __cplusplus
}
#endif

#endif	/* _RptTrafficMetrics_H_ */
#include "asn_internal.h"
