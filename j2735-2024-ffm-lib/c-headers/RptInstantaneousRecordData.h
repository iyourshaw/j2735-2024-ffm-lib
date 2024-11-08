/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "ProbeDataReport"
 * 	found in "asn/J2945-C-ProbeDataReport-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_RptInstantaneousRecordData_H_
#define	_RptInstantaneousRecordData_H_


#include "asn_application.h"

/* Including external dependencies */
#include "RptIntervalEvents.h"
#include "RptVehicleEvents.h"
#include "RptRoadwayEvents.h"
#include "RptCommSysPerfEvents.h"
#include "constr_CHOICE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum RptInstantaneousRecordData_PR {
	RptInstantaneousRecordData_PR_NOTHING,	/* No components present */
	RptInstantaneousRecordData_PR_intervalEvents,
	RptInstantaneousRecordData_PR_vehEvents,
	RptInstantaneousRecordData_PR_roadwayEvents,
	RptInstantaneousRecordData_PR_commSysPerfEvents
	/* Extensions may appear below */
	
} RptInstantaneousRecordData_PR;

/* RptInstantaneousRecordData */
typedef struct RptInstantaneousRecordData {
	RptInstantaneousRecordData_PR present;
	union RptInstantaneousRecordData_u {
		RptIntervalEvents_t	 intervalEvents;
		RptVehicleEvents_t	 vehEvents;
		RptRoadwayEvents_t	 roadwayEvents;
		RptCommSysPerfEvents_t	 commSysPerfEvents;
		/*
		 * This type is extensible,
		 * possible extensions are below.
		 */
	} choice;
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} RptInstantaneousRecordData_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_RptInstantaneousRecordData;
extern asn_CHOICE_specifics_t asn_SPC_RptInstantaneousRecordData_specs_1;
extern asn_TYPE_member_t asn_MBR_RptInstantaneousRecordData_1[4];
extern asn_per_constraints_t asn_PER_type_RptInstantaneousRecordData_constr_1;

#ifdef __cplusplus
}
#endif

#endif	/* _RptInstantaneousRecordData_H_ */
#include "asn_internal.h"